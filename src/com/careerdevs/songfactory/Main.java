package com.careerdevs.songfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Song Factory!");

        System.out.println("What is the title of your song?\n Title: ");
        String title = scan.nextLine();

        System.out.println("What artist made this song?\n Artist: ");
        String artist = scan.nextLine();

        System.out.println("Which genre is your song?\n Genre: ");
        String genre = scan.nextLine();

        System.out.println("How many seconds long is your song?\n Seconds: ");
        int seconds = scan.nextInt();

        Song song001 = new Song(title, artist, genre, seconds);

        System.out.println(song001);

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

//Fields: title (String), artist (String), genre (String), seconds (int)