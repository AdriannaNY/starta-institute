package lesson10.task2;

import java.util.Comparator;
import java.util.Objects;

public class CatComparator implements Comparator<Cat> { // using this interface, we can create object witch can compare our cats

    // Logic:
    // 1. Compare cats' age.
    // 2. If age is different - return age difference.
    // 3. If age is the same - compare weight.
    // 4. If weight is different - return weight difference.
    // 5. If weight is the same - compare color by alphabet.

    @Override
    public int compare(Cat cat1, Cat cat2) { // realisation of interface Comparator<>
        // if o1 < o2 --> return -1; if o1 > o2 --> return 1; if they are equals --> return 0;

        if (cat1.getAge() != cat2.getAge()) {
            return cat1.getAge() - cat2.getAge();
        }
        if (Double.compare(cat1.getWeight(), cat2.getWeight()) != 0) { // if change places of cat1 with cat2 --> reverse sorting
            return Double.compare(cat1.getWeight(), cat2.getWeight());
        }
        if (cat1.getColor() != null) { // prevent nullPointerException
            return cat1.getColor().compareTo(cat2.getColor());  // compareTo() - method of class String, sort by alphabet
        }
        return 0; // then cats are the same
    }


}
