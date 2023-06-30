package Ex2_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car mazda = new Car(210,5000,"Mazda","Red");
        Car mitsubishi = new Car(210,5000,"Mazdab","White");
        Car ford = new Car(220,7000,"Mazdag","Black");
        Car bmw = new Car(230,10000,"X5","Pink");

        Car[] cars = {mazda,mitsubishi,ford,bmw};

        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));
    }
}
