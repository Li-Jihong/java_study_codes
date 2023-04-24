package qizhong.Ex_8_4_1;

class GeoAreaSum{

    public static void main(String[] args) {
        GeometricObject a[] = {new Circle(5), new Cylinder(10,5),new Rectangle(6,8)};
        System.out.println("The arem sum is :" + sumArea(a));
    }

    public static double sumArea(GeometricObject[] a){
        double areaSum = 0;
        for(int i=0;i<a.length;i++){
            areaSum += a[i].findArea();
        }
        return areaSum;
    }
}

abstract class GeometricObject{
    public abstract double findArea();
    public abstract double findPerimeter();
}

class Rectangle extends GeometricObject{
    private double w, h;

    public Rectangle(double w, double h){
        this.w = w;
        this.h = h;
    }


    public double findArea(){
        return w*h;
    }

    public double findPerimeter(){
        return 2*(w+h);
    }
}

class Circle extends GeometricObject{
    private double r;

    public Circle(double r){
        this.r = r;
    }

    public double findArea(){
        return Math.PI*r*r;
    }

    public double findPerimeter(){
        return 2*Math.PI*r;
    }

    public double getR(){
        return r;
    }
}


class Cylinder extends GeometricObject{
    private double h, r;

    public Cylinder(double r, double h){
        this.r = r;
        this.h = h;
    }

    public double findArea(){
        return 2*Math.PI*r*(r+h);
    }

    public double findPerimeter(){
        return 0;
    }
}