package ru.netology.repository;

import ru.netology.javaqa.domain.Film;

public class FilmManager {
    private Film[] films = new Film[0];
    private int resultLength;
    private int defaultLength = 5;

    public void newFilm(Film film) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Film[] findAll() {
        return films;
    }

    public FilmManager() {
        this.defaultLength = 5;
    }

    public FilmManager(int customLength) {
        this.defaultLength = customLength;



    }

    public Film[] findLast() {
        Film[] all = films;
        if (resultLength <= films.length) {
            resultLength = defaultLength;
        } else {
            resultLength = films.length;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = all[all.length - 1 - i];
        }
        return result;
    }


}
