package cn.sepiggy.ioc;

public abstract class WaiMaiYuan {

    protected Food food;

    public WaiMaiYuan(Food food) {
        this.food = food;
    }

    abstract void songWaiMai();
}
