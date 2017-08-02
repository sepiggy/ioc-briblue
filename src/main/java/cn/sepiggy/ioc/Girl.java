package cn.sepiggy.ioc;

public class Girl extends WaiMaiYuan {

    public Girl(Food food) {
        super(food);
    }

    void songWaiMai() {
        System.out.println("我是小姑娘,为您送的外卖是："+food);
    }

}
