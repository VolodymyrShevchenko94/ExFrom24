package Ex2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //У папці з прикладами ex_004_comparable. Дописати логіку, щоб метод compareTo() здійснив
        // пошук за швидкістю (якщо ж швидкість у 2-х об'єктів дорівнює, то шукаємо за ціною)
        // -> ціною -> моделі -> кольору машини.


        Car mazda = new Car(35000,"Red",210,"CX5");
        Car mitsubishi = new Car(8000,"White",190,"Lancer X");
        Car ford = new Car(45000,"Black",220,"Mustang");
        Car bmw = new Car(70000,"Yellow",230,"X5");

        Car[] cars = {mazda , mitsubishi , ford , bmw};
        Arrays.sort(cars);

        for (Car tmp: cars) {
            System.out.println(tmp);
            
        }


    }
}
