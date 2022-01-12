package com.careerdevs.carchallenge;

public class Main {
    public static void main(String[] args) {

        Car carOne = new Car("Camaro", "Chevy", 100_000, 0.10F);

        Car carTwo = new Car("Mustang GT", "Ford", 30_000, 0.50F);

        Car carThree = new Car("Hellcat", "Dodge", 100, 0.90F);

        System.out.println(carOne.make + " "  + carOne.model);
        System.out.println(carTwo.make + " "  + carTwo.model);
        System.out.println(carThree.make + " "  + carThree.model);


    }
}

//Make: Mustang GT Model: Ford, mileage: 30000, gasTankPercent: 0.50
//
//Make: Hellcat, Model: Dodge, mileage: 100, gasTankPercent: 0.90
