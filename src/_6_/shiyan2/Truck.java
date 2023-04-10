package _6_.shiyan2;

public class Truck {
    ComputeWeight[] goods; //用ComputeWeight接口类型的数组作为数据成员
    double totalweights = 0;

    //构造方法
    Truck(ComputeWeight[] goods) {
        this.goods = goods;
    }

    //
    public void setgoods(ComputeWeight[] goods) {
        this.goods = goods;
    }

    //计算货物总重量。
    //每一件货物都有一个自重，所有货物的自重加起来就是这批货物（goods数组）的总重（totalweights）。
    public double getTotalweights() {
        totalweights = 0;
        for (int i = 0; i < goods.length; i++) {
            totalweights = totalweights + goods[i].computeWeight();
        }
        return totalweights;
    }
}
