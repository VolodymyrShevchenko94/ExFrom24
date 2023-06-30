package Ex2_1;

public class Car implements Comparable<Car> {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        int tempSpeed = this.speed - o.speed;
        if (tempSpeed == 0) {
            int tempPrice = this.price - o.price;
            if (tempPrice == 0){
                int tempModel = this.model.compareTo(o.model);
                if (tempModel == 0) {
                    return this.color.compareTo(o.color);
                }else return tempModel;

            }else return tempPrice;

        }else return tempSpeed;
    }
}
