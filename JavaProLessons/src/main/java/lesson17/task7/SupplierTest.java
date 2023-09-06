package lesson17.task7;

import java.util.function.Supplier;


// Functional Interface Supplier with 1 abstract method get() without parameters, that return something
public class SupplierTest {

    public static void main(String[] args) {

        Supplier<Integer> func = () -> 7; // method get() dont have parameters - (), must return 7
        print(func); // 7 7 7 7 7 7 7 7 7 7

        Supplier<Integer> func2 = () -> (int) (Math.random() * 20) + 1;
        print(func2); // 10 randoms from 1 to 20

    }

    public static void print(Supplier<Integer> func) {
        for (int i = 0; i < 10; i++) {
            System.out.print(func.get() + " ");
        }
        System.out.println();
    }
}
