package com.careerdevs.animalfactory;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //creating Scanner var
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to: Build - A - Pet");
        //ask questions
        System.out.println("Enter a species\n Species: ");
        String speciesInput = scan.nextLine();

        System.out.println("Enter the number of legs\n Legs: ");
        short legsInput = scan.nextShort();

        System.out.println("Does your pet live on land\n (true/false: ");
        boolean landInput = scan.nextBoolean();

        //creating (Animal) instance
        Animal newPet1 = new Animal(speciesInput, legsInput, landInput);

        //output field values (Animal) instance
        System.out.println(newPet1);
    }

}
