package com.example.nadus.politician.Adapters;

/**
 * Created by admin on 16-11-2017.
 */

public class ScheduleAdapter {
    private String title, genre, year;

    public ScheduleAdapter() {
    }

    public ScheduleAdapter(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
