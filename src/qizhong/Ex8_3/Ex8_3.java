package qizhong.Ex8_3;

class Test{
    public static void main(String[] args){
        ZPoint p = new ZPoint(11,9);
        ZPoint q = new ZPoint(100,21.5);
        System.out.println("The distance between (11,9) and (100,21.5) is :" + ZPoint.distance(p,q));
        System.out.println("The distance between (11,9) and (71,19) is :" + p.distance(71,19));
    }
}

class ZPoint{
    private  double x,y;

    public ZPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public static double distance(ZPoint p, ZPoint q){
        double d = Math.sqrt(Math.pow(p.getX() - q.getX(),2)+ Math.pow(p.getY() - q.getY(),2));
        return d;
    }

    public  double distance(double x, double y){
        double d = Math.sqrt(Math.pow(this.getX() - x,2)+ Math.pow(this.getY() - y,2));
        return d;
    }
}