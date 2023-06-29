package Ex1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //Виведення на екран елементів List: Створити список, заповнити його на 10 елементів
        // та вивести на екран вміст, використовуючи iterator.


        List list = new List();
        list.addElement(0,10);
        list.addElement(1,20);
        list.addElement(2,30);
        list.addElement(3,40);
        list.addElement(4,50);
        list.addElement(5,60);
        list.addElement(6,70);
        list.addElement(7,80);
        list.addElement(8,90);
        list.addElement(9,100);



        Iterator<Integer> iterator = list.list.iterator();

        while (iterator.hasNext()) {
            Integer tmp = iterator.next();
            System.out.println(tmp);
        }

    }
}
