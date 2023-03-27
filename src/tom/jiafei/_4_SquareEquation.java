/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-03-27
 * \* Time: 14:38
 * \
 */
package tom.jiafei;
public class _4_SquareEquation {
    double a,b,c;
    double root1,root2;
    boolean boo;
    public _4_SquareEquation(double a,double b,double c) {
        this.a=a;
        this.b=b;
        this.c=c;
        if(a!=0)
            boo=true;
        else
            boo=false;
    }
    public void getRoots() {
        if(boo) {
            System.out.println("是一元 2 次方程");
            double disk=b*b-4*a*c;
            if(disk>=0) {
                root1=(-b+Math.sqrt(disk))/(2*a);
                root2=(-b-Math.sqrt(disk))/(2*a);
                System.out.printf("方程的根:%f,%f\n",root1,root2);
            }
            else {
                System.out.printf("方程没有实根\n");
            }
        }
        else {
            System.out.println("不是一元 2 次方程");
        }
    }
    public void setCoefficient(double a,double b,double c) {
        this.a=a;
        this.b=b;
        this.c=c;
        if(a!=0)
            boo=true;
        else
            boo=false;
    }
}
