package lesson9.task4;

import java.util.Arrays;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String[] array = {"Banana", "Milk", "Apple", "Nuts", "Strawberry", "Vanilla"};
        System.out.println("Array: " + Arrays.toString(array)); //Array: [Banana, Milk, Apple, Nuts, Strawberry, Apple, Vanilla]

        Set<String> result = ArrayToSet.convertToSet1(array); //call static method using only our util class
        System.out.println("Result1: " + result); //[Apple, Nuts, Strawberry, Vanilla, Banana, Milk] - double apple was removed

        result = ArrayToSet.convertToSet2(array);
        System.out.println("Result2: " + result); //[Apple, Nuts, Strawberry, Vanilla, Banana, Milk]

        result = ArrayToSet.convertToSet3(array);
        System.out.println("Result3: " + result); //[Apple, Nuts, Strawberry, Vanilla, Banana, Milk]

        result = ArrayToSet.convertToSet4(array);
        System.out.println("Result4: " + result); //random (with every run of main) not sorted result: [Vanilla, Apple, Milk, Nuts, Strawberry, Banana] - work with array without repeat elements only
        System.out.println("Result4: " + result); //random (with every run of main) not sorted result: [Vanilla, Apple, Milk, Nuts, Strawberry, Banana] - work with array without repeat elements only
        System.out.println("Result4: " + result); //random (with every run of main) not sorted result: [Vanilla, Apple, Milk, Nuts, Strawberry, Banana] - work with array without repeat elements only

        result = ArrayToSet.convertToSet5(array);
        System.out.println("Result5: " + result); //[Apple, Nuts, Strawberry, Vanilla, Banana, Milk]

    }
}
