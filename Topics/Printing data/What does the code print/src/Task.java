// You can experiment here, it won’t be checked

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter some text below:");
        String next = scanner.nextLine();
        System.out.println("You entered next text:");
        System.out.println(next);

        final Car myCar = new Car();
        myCar.producer = "BMW";
        myCar.size = 3.2;
        myCar.year = 2016;

        Car yourCar = new Car();
        yourCar.producer = "Mercedes";
        yourCar.size = 2.8;
        yourCar.year = 2021;


    }
}

class Car {
    String producer;
    double size;
    int year;
}
