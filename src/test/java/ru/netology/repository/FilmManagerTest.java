package ru.netology.repository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.domain.Film;
public class FilmManagerTest {
    Film film1 = new Film(1, 111, "Бладшот", "боевик", "12.03.2020", false);
    Film film2 = new Film(2, 222, "Вперед", "мультфильм", "05.03.2020", false);
    Film film3 = new Film(3, 333, "Отель 'Белград'", "комедия", "05.03.2020", false);
    Film film4 = new Film(4, 444, "Джентельмены", "боевик", "13.02.2020", false);
    Film film5 = new Film(5, 555, "Человек-невидимка", "ужасы", "05.03.2020", false);
    Film film6 = new Film(6, 666, "Тролли.Мировой тур", "ультфильм", "19.03.2020", true);
    Film film7 = new Film(7, 777, "Номер один", "комедия", "19.03.2020", true);

    @Test
    public void shouldAll() {

        FilmManager repo = new FilmManager();
        repo.newFilm(film1);
        repo.newFilm(film2);
        repo.newFilm(film3);
        repo.newFilm(film4);
        repo.newFilm(film5);
        repo.newFilm(film6);
        repo.newFilm(film7);

        Film[] expected = {film1, film2, film3, film4, film5, film6, film7};
        Film[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastDefault() {

        FilmManager repo = new FilmManager();
        repo.newFilm(film1);
        repo.newFilm(film2);
        repo.newFilm(film3);
        repo.newFilm(film4);
        repo.newFilm(film5);
        repo.newFilm(film6);
        repo.newFilm(film7);

        Film[] expected = {film7, film6, film5, film4, film3};
        Film[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastCustom() {

        FilmManager repo = new FilmManager(3);
        repo.newFilm(film1);
        repo.newFilm(film2);
        repo.newFilm(film3);
        repo.newFilm(film4);
        repo.newFilm(film5);
        repo.newFilm(film6);
        repo.newFilm(film7);

        Film[] expected = {film7, film6, film5};
        Film[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastCustom2() {

        FilmManager repo = new FilmManager(7);
        repo.newFilm(film1);
        repo.newFilm(film2);
        repo.newFilm(film3);
        repo.newFilm(film4);
        repo.newFilm(film5);
        repo.newFilm(film6);
        repo.newFilm(film7);

        Film[] expected = {film7, film6, film5, film4,film3,film2,film1};
        Film[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}