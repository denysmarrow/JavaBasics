package com.careerdevs.walkthrough.sayhello;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        whatIsYourName();
//        whatIsYourFullName();
        userSignUp();


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

    public static void userSignUp () {
        String userName = getUserInput("Enter a username");
        String passWord = getUserInput("Enter a password");

        System.out.println("Thanks for signing up " + userName);

        if(passWord.length() < 5) {
            System.out.println("Your password is not very good!");
        }
    }

    public static String getUserInput (String question) {
        System.out.println(question + "\nInput: ");
        return scanner.nextLine();
    }

}

