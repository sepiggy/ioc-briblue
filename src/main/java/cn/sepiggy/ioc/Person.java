package cn.sepiggy.ioc;

import cn.sepiggy.dip.Driveable;

// 原来 Person 自己掌控着内部 mDriveable 的实例化，现在将这一过程移到 Person 外面。
public class Person {

    private Driveable mDriveable;

    public Person(Driveable driveable) {
        this.mDriveable = driveable;
    }

    public void chumen() {
        System.out.println("出门了");

        mDriveable.drive();
    }

}
