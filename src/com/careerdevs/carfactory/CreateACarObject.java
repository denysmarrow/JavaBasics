package com.careerdevs.carfactory;

public class CreateACarObject {
    public String make;
    public String model;
    public int mileage;
    public float gasTankPercentage;

    public CreateACarObject (String make, String model, int mileage, int gasTankPercentage) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercentage = gasTankPercentage;

    }



    public void showCarFacts () {
         System.out.println("This " + make + " " + model + "has " + mileage + "miles, and the gas is at %" + gasTankPercentage);
     }
}
