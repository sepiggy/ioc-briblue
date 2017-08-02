package cn.sepiggy.dip;

public class Person {

    private Driveable mDriveable;

    public Person() {
//        mDriveable = new Train();
        mDriveable = new Bike();
    }

    public void chumen() {
        System.out.println("出门了");
        mDriveable.drive();
    }
}
