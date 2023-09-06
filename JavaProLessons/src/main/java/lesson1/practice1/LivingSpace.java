package lesson1.practice1;

import java.util.Arrays;

class LivingSpace {

    // CMD (Ctrl) + / - комментарий

    private String street;
    private int builder;
    private int floor;
    private String[] family;

    public LivingSpace(String street, int builder, int floor, String[] family) {
        this.street = street;
        this.builder = builder;
        this.floor = floor;
        this.family = family;
    }

    public void getSizeOfFamily() {
        System.out.println(family.length);
    }

    @Override
    public String toString() {
        String result = "Str: " + street + "; build.: " + builder + "; fl.: " + floor + "; family: " + Arrays.toString(family);
        return result;
    }

    public void print() {
        String result = "Str: " + street + "; build.: " + builder + "; fl.: " + floor + "; family: " + Arrays.toString(family);
        System.out.println(result);
    }

    public String getStreet() {
        return street;
    }

    public int getBuilder() {
        return builder;
    }

    public int getFloor() {
        return floor;
    }

    public String[] getFamily() {
        return family;
    }

    public void setStreet(String street) {
        if (street != null) this.street = street;
    }

    public void setBuilder(int builder) {
        this.builder = builder;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setFamily(String[] family) {
        this.family = family;
    }
}
