package com.careerdevs.demos.carexample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a car name: ");
        String userInput = scanner.nextLine();

        Car car1 = new Car(userInput, 500);
        car1.showSpeed();

        Car car2 = new Car("Jeep", 500);
        car2.showSpeed();

    }

}
