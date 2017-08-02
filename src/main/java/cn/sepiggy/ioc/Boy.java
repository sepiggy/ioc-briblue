package cn.sepiggy.ioc;

public class Boy extends WaiMaiYuan {

    public Boy(Food food) {
        super(food);
    }

    void songWaiMai() {
        System.out.println("我是小伙子,为您送的外卖是："+food);
    }

}
