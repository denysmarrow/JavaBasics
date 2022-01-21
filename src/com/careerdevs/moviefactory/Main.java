package com.careerdevs.moviefactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Film Pal! Let's get some details about your movie!");

        System.out.println("What is the title?\n Title: ");
        String title = scan.nextLine();

        System.out.println("Who directed the film?\n Director: ");
        String director = scan.nextLine();

        System.out.println("How many minutes is the runtime?\n Runtime: ");
        float runtimeInMin = scan.nextFloat();

        System.out.println("Has this film been released? ( true or false)\n Released: ");
        boolean hasBeenReleased = scan.nextBoolean();

        Movie myMovie = new Movie(title, director, runtimeInMin, hasBeenReleased);

        System.out.println(myMovie);


    }
}

//Fields: title (String), director (String), runtimeInMin (float), hasBeenReleased (boolean)