package com.careerdevs.walkthrough.sayhello;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        whatIsYourName();
        whatIsYourFullName();


    }

    public static void whatIsYourName() {


        System.out.println("What is your first\nName: ");
        String userName = scanner.nextLine();
        System.out.println("Hello, nice to meet you " + userName);



    }

    public static void whatIsYourFullName() {

        System.out.println("What is your first\nName: ");
        String firstName = scanner.nextLine();
        System.out.println("What is your last\nName: ");
        String lastName = scanner.nextLine();

        System.out.println("It is so nice to formally meet you " + firstName + " " + lastName );
    }
    }

