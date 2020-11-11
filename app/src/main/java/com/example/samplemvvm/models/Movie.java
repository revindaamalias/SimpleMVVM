package com.example.samplemvvm.models;

public class Movie {
    private String movieTitle;
    private String movieDescription;
    private Boolean movieStatus;

    public Movie(){
    }

    public Movie(String movieTitle, String movieDescription, boolean movieStatus){
        this.movieTitle = movieTitle;
        this.movieDescription = movieDescription;
        this.movieStatus = movieStatus;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public Boolean getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(Boolean movieStatus) {
        this.movieStatus = movieStatus;
    }
}
