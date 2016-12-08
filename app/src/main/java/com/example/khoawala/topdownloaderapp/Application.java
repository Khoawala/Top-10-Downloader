package com.example.khoawala.topdownloaderapp;

/**
 * Created by Khoawala on 12/6/2016.
 */

public class Application {

    private String name;
    private String artist;
    private String releaseDate;

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String toString(){
        return "Name: " + getName() + "\n Artist: " + getArtist() + "\nRelease Date: " + getReleaseDate();
    }
}
