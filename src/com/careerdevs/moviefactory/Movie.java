package com.careerdevs.moviefactory;

public class Movie {
    //Fields: title (String), director (String), runtimeInMin (float), hasBeenReleased (boolean)
    public String title;
    public String director;
    public float runtimeInMin;
    public boolean hasBeenReleased;

    public Movie (String title, String director, float runtimeInMin, boolean hasBeenReleased){

        this.title = title;
        this.director = director;
        this.runtimeInMin = runtimeInMin;
        this.hasBeenReleased = hasBeenReleased;

    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", runtimeInMin=" + runtimeInMin +
                ", hasBeenReleased=" + hasBeenReleased +
                '}';
    }
}
