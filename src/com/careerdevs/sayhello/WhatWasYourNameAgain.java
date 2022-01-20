package com.careerdevs.sayhello;

import java.util.Scanner;

public class WhatWasYourNameAgain {
    public static void main(String[] args) {

        helloAgain();



    }

    public static void helloAgain () {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name again? : ");
        String name = scan.nextLine();
        System.out.println("How old are you in dog years?: ");
        int ageInDogYears = scan.nextInt();
        System.out.println("How many kids do you have?: ");
        byte kids = scan.nextByte();
        System.out.println("Please type your full birthday using no dashes or spaces: ");
        long birthday = scan.nextLong();
        System.out.println("What is your favorite radio station?: ");
        float favRadioStation = scan.nextFloat();
        System.out.println("What year did you graduate?: ");
        short gradYear = scan.nextShort();
        System.out.println("Do you like the color blue?: ");
        boolean colorPicker = scan.hasNextBoolean();


        System.out.println("Name: " + name );
        System.out.println("Age in dog years: " + ageInDogYears);
        System.out.println("Kids: " + kids);
        System.out.println("Birthday: " + birthday);
        System.out.println("Favorite Station: " + favRadioStation);
        System.out.println("Graduated in: " + gradYear);
        System.out.println("Likes the color blue: " + colorPicker);


    }
}
