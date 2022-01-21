package com.careerdevs.countryfactory;

public class Country {
    //Fields: name (String), population (long), capital (String)
    public String name;
    public long population;
    public String capital;

    public Country (String name, long population, String capital){

        this.name = name;
        this.population = population;
        this.capital = capital;


    }

    @Override
    public String toString() {
        return "Country{" +
                "name=' " + name + '\'' +
                ", population = " + population +
                ", capital =' " + capital + '\'' +
                '}';
    }
}


