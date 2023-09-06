package lesson15.task2.test;

import java.util.ArrayList;
import java.util.List;

public class Planet {
    private List<Satellite> satellites = new ArrayList<>();

    public Planet() { // default constructor (generate constructor --> select none)
    }

    public Planet(List<Satellite> satellites) { // constructor
        this.satellites = satellites;
    }
}
