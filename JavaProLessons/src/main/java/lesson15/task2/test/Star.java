package lesson15.task2.test;

import java.util.ArrayList;
import java.util.List;

// Класс Star реализует паттерн Singleton, то есть у нас может существовать только
// один - единственный обьект этого класса. Что для этого нужно
// 1. Обьявить конструктор приватным.
// 2. Написать метод (getInstance()), который либо создает обьект, если он ранее не был создан,
//    либо возвращает ранее созданный обьект.
public class Star {

    private static Star star; // private object
    private List<Planet> planets = new ArrayList<>();
    private List<Asteroid> asteroids = new ArrayList<>();

    private Star() { // private constructor --> can't create objects of Star
    }

    public static Star getInstance() {
        if (star == null) {
            star = new Star();
        }
        return star;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    public List<Asteroid> getAsteroids() {
        return asteroids;
    }

    public void setAsteroids(List<Asteroid> asteroids) {
        this.asteroids = asteroids;
    }
}
