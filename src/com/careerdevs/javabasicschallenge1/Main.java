package com.careerdevs.javabasicschallenge1;

public class Main {
    public static void main(String[] args) {

        CarCollector carOne = new CarCollector("Camaro", "Chevy", 100_000, 0.10F);

        System.out.println(CarCollector.make);
        System.out.println(CarCollector.model);
        System.out.println(CarCollector.mileage);
        System.out.println(CarCollector.gasTank);

    }
}

