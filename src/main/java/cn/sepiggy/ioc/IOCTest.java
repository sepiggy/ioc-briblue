package cn.sepiggy.ioc;


import cn.sepiggy.dip.Bike;
import cn.sepiggy.dip.Car;
import cn.sepiggy.dip.Train;

// Person 把内部依赖的创建权力移交给了 IOCTest 这个类中的 main() 方法。
// 也就是说 Person 只关心依赖提供的功能，但并不关心依赖的创建。
// IOCTest 在这里指代了 IOC 容器。
public class IOCTest {

    public static void main(String[] args) {

        Bike bike = new Bike();
        Car car = new Car();
        Train train = new Train();

//        Person person = new Person(train);
        Person person = new Person(car);

        person.chumen();

    }

}
