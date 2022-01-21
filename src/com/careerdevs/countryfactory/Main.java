package com.careerdevs.countryfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the name of your Country?\n Country:");
        String name = scan.nextLine();

        System.out.println("What is the population there?\n Population: ");
        long population = scan.nextLong();

        System.out.println("What is the capital of your Country?\n Capital: ");
        String capital = scan.next();

        Country myFirstCountry = new Country(name, population, capital);

        System.out.println(myFirstCountry);


    }

    @Override
    public String toString() {
        return super.toString();
    }
}

//Fields: name (String), population (long), capital (String)