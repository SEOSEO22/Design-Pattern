package hw.ch04;

import hw.ch04.car.CarFactory;
import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("20220732 차서연");

        Factory carFactory = new CarFactory();

        Product car1 = carFactory.create("차서연");
        Product car2 = carFactory.create("그랜저");
        Product car3 = carFactory.create("소나타");
        Product car4 = carFactory.create("캐스퍼");

        car1.use();
        car2.use();
        car3.use();
        car4.use();

        System.out.println();

        carFactory.printAllModelNames();
    }
}
