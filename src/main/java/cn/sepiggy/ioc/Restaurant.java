package cn.sepiggy.ioc;

// IOC 容器
public class Restaurant {

    private static WaiMaiYuan waiMaiYuan;

    public static void peiCan(int orderId, int flowId) {
        Food food;

        if (orderId == 0) {
            food = new PiJiuYa();
        } else {
            food = new DuoJiaoYuTou();
        }

        if (flowId % 2 == 0) {
            waiMaiYuan = new Boy(food);
        } else {
            waiMaiYuan = new Girl(food);
        }

        waiMaiYuan.songWaiMai();
    }

}
