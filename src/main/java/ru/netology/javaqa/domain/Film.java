package ru.netology.javaqa.domain;

public class Film {

    private int id;
    private int filmId;
    private String name;
    private String genre;
    private String premierDate;
    private boolean premierTomorrow;


    public Film(int id, int filmId, String name, String genre, String premierDate, boolean premierTomorrow){
        this.id = id;
        this.filmId = filmId;
        this.name = name;
        this.genre = genre;
        this.premierDate = premierDate;
        this.premierTomorrow = premierTomorrow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPremierDate() {
        return premierDate;
    }

    public void setPremierDate(String premierDate) {
        this.premierDate = premierDate;
    }

    public boolean isPremierTomorrow() {
        return premierTomorrow;
    }

    public void setPremierTomorrow(boolean premierTomorrow) {
        this.premierTomorrow = premierTomorrow;
    }
}
