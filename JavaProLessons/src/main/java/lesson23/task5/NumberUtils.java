package lesson23.task5;

public class NumberUtils<T extends Number> { // restriction,  can't put String

    private T value;

    public NumberUtils(T value) { // constructor
        this.value = value;
    }

    public void printIntegerValue() { // not static -> must create object to call this method
        System.out.println(value.intValue()); // don't need to cas value to Number
    }


}
