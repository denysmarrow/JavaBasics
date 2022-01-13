package com.careerdevs.carchallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car carOne = new Car("Camaro", "Chevy", 100_000, 0.10F);

        Car carTwo = new Car("Mustang GT", "Ford", 30_000, 0.50F);

        Car carThree = new Car("Hellcat", "Dodge", 100, 0.90F);

        System.out.println(carOne.make + " "  + carOne.model);
        System.out.println(carTwo.make + " "  + carTwo.model);
        System.out.println(carThree.make + " "  + carThree.model);

        //Bonus Solution : Array

//        Car[] myCarArr = new Car[3];
//        myCarArr[0]= carOne;
//        myCarArr[1]= carTwo;
//        myCarArr[2]= carThree;

        Car[] carArr = new Car[] {carOne, carTwo, carThree};

        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(carOne);
        carArrayList.add(carTwo);
        carArrayList.add(carThree);

        for (int i = 0; i < carArr.length; i++) {
            Car tempCar = carArr[i];
            System.out.println(tempCar.make + " " + tempCar.model);
        }

        for (int i = 0; i < carArrayList.size(); i++) {
            Car tempCar = carArrayList.get(i);
            System.out.println(tempCar.make + " " + tempCar.model);

        }


    }
}

//Make: Mustang GT Model: Ford, mileage: 30000, gasTankPercent: 0.50
//
//Make: Hellcat, Model: Dodge, mileage: 100, gasTankPercent: 0.90
