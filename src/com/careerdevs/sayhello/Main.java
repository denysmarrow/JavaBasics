package com.careerdevs.sayhello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner whatIsYourFullName = new Scanner(System.in);
        System.out.println("What is your first\nName: ");
        String firstName = whatIsYourFullName.nextLine();
        System.out.println("What is your last\nName: ");
        String lastName = whatIsYourFullName.nextLine();

        System.out.println("It is so nice to formally meet you " + firstName + " " + lastName );
    }

    public static void whatisYourName() {
        Scanner whatIsYourName = new Scanner(System.in);

        System.out.print("Please enter your\nName: ");
        String name = whatIsYourName.nextLine();
        System.out.println("Hello, nice to meet you " + name);
    }


}
