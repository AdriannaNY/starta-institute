package lesson2.practice2;

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
