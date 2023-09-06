package lesson15.task2.test;

import java.util.ArrayList;
import java.util.List;

public class StarSystem {

    public static void main(String[] args) {

        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet());
        planets.add(new Planet());
        planets.add(new Planet());
        planets.add(new Planet());
        planets.add(new Planet());

        List<Satellite> satellites = new ArrayList<>();
        satellites.add(new Satellite());
        satellites.add(new Satellite());
        satellites.add(new Satellite());

        List<Asteroid> asteroids = new ArrayList<>();
        asteroids.add(new Asteroid());
        asteroids.add(new Asteroid());
        asteroids.add(new Asteroid());
        asteroids.add(new Asteroid());

        Planet planet = new Planet(satellites); // new planet
        planets.add(planet); // add it to our planets

        // Must make Verbot for creating 2 and more stars in our star system (must be only 1)
        // --> must make private constructor in class Star
//        Star star1 = new Star();
//        Star star2 = new Star();

        // Pattern Singleton - we can create only 1 object of class Star

        Star star1 = Star.getInstance();
        Star star2 = Star.getInstance();

        star1.setPlanets(planets); // see in Debug: have link Star@738 and have planets + asteroids
        star2.setAsteroids(asteroids); // see in Debug: have link Star@738 and have planets + asteroids

        System.out.println(star1 == star2); // true, because same link - it's same objects = 1 object

    }
}
