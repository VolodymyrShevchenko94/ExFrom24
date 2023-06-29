package Ex2;

import java.util.Comparator;

public class Car  {
     int price;
     String color;
     int speed;
     String model;

    public Car(int price, String color, int speed, String model) {
        this.price = price;
        this.color = color;
        this.speed = speed;
        this.model = model;
    }



    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", model='" + model + '\'' +
                '}';
    }




}

class sortByPrice implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Car) o1.speed) - ((Car)o2.speed);
    }
}



