package com.careerdevs.fruitfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Fruit Basket!");
        System.out.println("Please enter the name of your fruit\n Name: ");
        String name = scan.nextLine();

        System.out.println("Please enter the color of your fruit\n Color: ");
        String color = scan.nextLine();

        System.out.println("Does your fruit have seeds? (true or false)\n Color: ");
        boolean hasSeeds = scan.nextBoolean();

        Fruit basket1 = new Fruit(name, color, hasSeeds);

        System.out.println(basket1);


    }

    @Override
    public String toString() {
        return super.toString();
    }
}

//Fields: name (String), color (String), hasSeeds (boolean)