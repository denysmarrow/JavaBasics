package com.careerdevs;

public class Main {

    public static void main(String[] args) {

        Person[] allPeople = new Person[People.firstNames.length];

        for (int i = 0; i < People.firstNames.length; i++){

//            System.out.println(People.lastNames[i]);
            String fName = People.firstNames[i];
            String lName = People.lastNames[i];

            Person tempPerson = new Person(fName, lName);
            //add the new Person to the array of Persons
            allPeople[i] = tempPerson;



        }




    }
    public static String createFullName (String fName, String lName) {
            return fName + " " + lName;

    }




}



//        String createdName = createFullName(firstName, lastName);
//        System.out.println(createdName);
//        String generatedName = NameGenerator.generateFullName("first", "last");



//        Person myPerson = new Person(firstName, lastName);
//        System.out.println("Firstname: " + myPerson.firstName);
//        System.out.println("Lastname: " + myPerson.lastName);
//        System.out.println(myPerson.getFullName() );

//        myPerson.sayHello();

