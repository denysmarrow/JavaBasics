package com.careerdevs.walkthrough.sayhello;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        whatIsYourName();
//        whatIsYourFullName();
//        userSignUp();

        int num = getUserIntInput("enter a number");
        String str = getUserStringInput("enter a string");
        System.out.println(num);
        System.out.println(str);


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

//    public static void userSignUp () {
//        String userName = getUserInput("Enter a username");
//        String passWord = getUserInput("Enter a password");
//
//        System.out.println("Thanks for signing up " + userName);
//
//        if(passWord.length() < 5) {
//            System.out.println("Your password is not very good!");
//        }
//    }

    public static void simpleCalculator () {

    }

    public static int getUserIntInput (String question) {
        System.out.println(question + "\nInt");
        int input = scanner.nextInt();

        //This line of code will clear the input line, otherwise the next time input is
        //taken it will just read the left over new-line character
        scanner.nextLine();

        return input;
    }

    public static String getUserStringInput (String question) {
        System.out.println(question + "\nInput: ");
        String input = scanner.nextLine();
        return input;
    }

    public static int sum (int num1, int num2) {
        return num1 + num2;
    }

}

