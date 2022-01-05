package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        String firstName = "Denys";
        String lastName = "Marrow";

//        String createdName = createFullName(firstName, lastName);
//        System.out.println(createdName);
        String generatedName = NameGenerator.generateFullName("first", "last");

        Person myPerson = new Person(firstName, lastName);
        System.out.println("Firstname: " + myPerson.firstName);
        System.out.println("Lastname: " + myPerson.lastName);
        System.out.println(myPerson.getFullName());


    }
    public static String createFullName (String fName, String lName) {
            return fName + " " + lName;

    }




}

