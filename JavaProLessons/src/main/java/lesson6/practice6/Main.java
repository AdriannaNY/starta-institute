package lesson6.practice6;

import java.util.Arrays;

class LivingSpace extends AbsLiving {

    // CMD (Ctrl) + / - комментарий

    private String street;
    private int builder;
    private String[] family;

    public LivingSpace(String street, int builder, String[] family) {
        this.street = street;
        this.builder = builder;
        this.family = family;
    }

    public void getSizeOfFamily() {
        System.out.println(family.length);
    }

    @Override
    public String toString() {
        String result = "Str: " + street + "; build.: " + builder + "; family: " + Arrays.toString(family);
        return result;
    }

    public void print() {
        String result = "Str: " + street + "; build.: " + builder + "; family: " + Arrays.toString(family);
        System.out.println(result);
    }

    public String getStreet() {
        return street;
    }

    public int getBuilder() {
        return builder;
    }

    public String[] getFamily() {
        return family;
    }
}

abstract class AbsLiving implements Living {

    @Override
    public double getSquare() {
        return 45;
    }
}

interface Living {
    int x = 100;
    void getSizeOfFamily();
    double getSquare();
}

class Home extends LivingSpace {

    private int numberOfFloors;

    public Home(String street, int builder, String[] family, int numberOfFloors) {
        super(street, builder, family);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        // наиболее прямолинейный путь
        String result = "[Home] " + "Str: " + super.getStreet() +
                "; build.: " + super.getBuilder() +
                "; family: " + Arrays.toString(super.getFamily()) +
                "; Number_of_floors: " + numberOfFloors;
        return result;

        // более профессиональный подход
//        return "[Home] " + super.toString() + "; Number_of_floors = " + numberOfFloors;
    }
}

class Apartment extends LivingSpace {

    private int floor;

    public Apartment(String street, int builder, String[] family, int floor) {
        super(street, builder, family);
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "[Apt] " + super.toString() + "; floor: " + floor;
    }
}

public class Main {
    public static void main(String[] args) {
        LivingSpace space = new LivingSpace(
                "Seestr.", 10, new String[]{"Bob", "Anna", "Emily"}
        );

        System.out.println(space);

        Home home = new Home("Friedrichstr.", 12, new String[]{"Bob", "Anna", "Emily"}, 4);
        System.out.println(home);

        Apartment apartment = new Apartment("Eichstr.", 30, new String[]{"Bob", "Anna", "Emily"}, 3);
        System.out.println(apartment);

        Object q = new LivingSpace("Teststr", 1, new String[]{"A", "B", "C"});
    }
}