package com.careerdevs.javabasicschallenge1;

public class Main {
    public static void main(String[] args) {

        CarCollector carOne = new CarCollector("Camaro", "Chevy", 100_000, 0.10F);

        CarCollector carTwo = new CarCollector("Mustang GT", "Ford", 30_000, 0.50F);

        CarCollector carThree = new CarCollector("Hellcat", "Dodge", 100, 0.90F);

        System.out.println(CarCollector.make);
        System.out.println(CarCollector.model);
        System.out.println(CarCollector.mileage);
        System.out.println(CarCollector.gasTank);

    }
}

//Make: Mustang GT Model: Ford, mileage: 30000, gasTankPercent: 0.50
//
//Make: Hellcat, Model: Dodge, mileage: 100, gasTankPercent: 0.90
