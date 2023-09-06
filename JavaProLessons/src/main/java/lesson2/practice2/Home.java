package lesson2.practice2;

import java.util.Arrays;

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
