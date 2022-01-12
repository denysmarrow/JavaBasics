package com.careerdevs.javabasicschallenge1;

public class Main {
    public static void main(String[] args) {

        CarCollector myCarCollector = new CarCollector("Camaro", "Chevy", 100000, 0.10F);

        System.out.println(CarCollector.make);
        System.out.println(CarCollector.model);
        System.out.println(CarCollector.mileage);
        System.out.println(CarCollector.gasTank);

    }
}

