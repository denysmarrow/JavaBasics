package com.careerdevs.carfactory;


import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//            createACar();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the car's model: ");
        String userInput = scanner.nextLine();
        System.out.println("What is the make of this car?\n Car Make: ");
        String make = scanner.nextLine();

        int userInputNumbers = scanner.nextInt();

        CreateACarObject car1 = new CreateACarObject(userInput, userInput, userInputNumbers, userInputNumbers);
        car1.showCarFacts();


//            createACarObject();





    }

        public static String createACar(){

            System.out.println("Who is the owner of this car\n Owner Name: ");
            String owner = scanner.nextLine();
            System.out.println("Hi " + owner + "!");
            System.out.println("What is the make of this car?\n Car Make: ");
            String make = scanner.nextLine();
            System.out.println("What is the model of this car?\n Car Model: ");
            String model = scanner.nextLine();
            System.out.println(owner + " " + "owns the car" + " " + make + " " + model);



            return owner;
    }

//        public static String createACarObject() {
//            System.out.println("What is the make of this car?\n Car Make: ");
//            String make = scanner.nextLine();
//            System.out.println("What is the model of this car?\n Car Model: ");
//            String model = scanner.nextLine();
//            System.out.println("What is the mileage of this car?\n Mileage: ");
//            int mileage = scanner.nextInt();
//            System.out.println("What is the gas tank percentage?\n Gas Tank Percentage: ");
//            double gasTankPercentage = scanner.nextInt();
//            System.out.println("This car is a " + make + ", " + model + ".\n" +
//                    "It has " + mileage + " " + "miles, and " + gasTankPercentage + "gas.");
//
//            return make;
//
//        }








}
