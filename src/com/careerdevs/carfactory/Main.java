package com.careerdevs.carfactory;


import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//            createACar();




           createACarObject();





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

        public static void createACarObject () {
            Scanner scan = new Scanner (System.in);

            System.out.println("Car\nModel: ");
            String make = scan.nextLine();

            System.out.println("Car\nMake: ");
            String model = scan.nextLine();

            System.out.println("Car\nMileage: ");
            int mileage = scanner.nextInt();

            System.out.println("Car\nGas Tank Percentage: ");

            int gasTankPercentage = scanner.nextInt();

            CreateACarObject carObject1 = new CreateACarObject(model, make, mileage, gasTankPercentage);

            System.out.println(carObject1);

        }








}
