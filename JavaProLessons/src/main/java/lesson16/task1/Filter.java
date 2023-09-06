package lesson16.task1;

@FunctionalInterface  // annotation prevent adding more than 1 abstract method in this Interface
public interface Filter { // can't create objects of Interface (can use anonim class)

    boolean test(Student student);
    // abstract method(without body) - only one in Functional Interface
    // if we add second abstract method - this Interface will not be Functional
    // and the logic of FunctionalInterface will destroyed

    // void test(int i); // second abstract method not allowed here, because
    // java machine will not understand what method she must use in lambda expression
}
