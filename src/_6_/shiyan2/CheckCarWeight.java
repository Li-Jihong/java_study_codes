package _6_.shiyan2;

public class CheckCarWeight {

    public static void main(String[] args) {

        ComputeWeight[] goods = new ComputeWeight[650]; //650件货物
        System.out.println("添加了洗衣机类，简单分为4类：");
        //简单把货物分为3类。
        for (int i = 0; i < goods.length; i++) { //简单分为4类
            if (i % 4 == 0) {//此时货物为电视
                goods[i] = new Television();
            } else if (i % 4 == 1) {//此时货物为电脑
                goods[i] = new Computer();
            } else if (i % 4 == 2) {//此时货物为洗衣机
                goods[i] = new WashMachine();
            } else if (i % 4 == 3) {//此时货物为洗衣机
                goods[i] = new Refrigerrator();
            }
        }

        //货车truck1，装着goods这组货物。
        Truck truck = new Truck(goods);
        System.out.printf("\n货车装载的货物总重量:%-8.5f kg\n", truck.getTotalweights());
        goods = new ComputeWeight[68]; //68件货物
        for (int i = 0; i < goods.length; i++) {
            if (i % 2 == 0) goods[i] = new Television();
            else goods[i] = new WashMachine();
        }
        truck.setgoods(goods);
        System.out.printf("\n货车装载的货物总重量:%-8.5f kg\n", truck.getTotalweights());
        /*
         对于数组goods中的每一个good[i]，都已分配给不同的类的对象（电视/电脑/洗衣机），
        则调用truck1.getTotalweights()，具体执行也是对应类重写的getTotalweights()方法。
         */
    }
}
