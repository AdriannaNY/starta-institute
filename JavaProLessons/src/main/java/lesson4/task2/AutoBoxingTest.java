package lesson4.task2;

public class AutoBoxingTest {
    public static void main(String[] args) {
        int intValue = 8; //int - primitive type
        Integer integerValue = null; //reference integerValue - refer to an object of type Integer
        System.out.println(integerValue);

        // Для каждого примитивного типа есть свой класс-оболочка:
        // int      Integer
        // double   Double
        // float    Float
        // long     Long
        // boolean  Boolean
        // byte     Byte
        // short    Short
        // char     Character

        //===============Autoboxing: ===============
        integerValue = intValue; //Autoboxing, занесение примитивного типа в обьектный
        // значение переменной примитивного типа присвоили обьекту -> можем использовать в коллекциях и вызывать методы
        System.out.println(integerValue);  //8
        // in Debug we see an object of class Integer with value = 8

        Integer integer = 7; // also - autoboxing
        Integer integer1 = new Integer(7); // same, used in old versions of Java

        //===============Unboxing: ===============
        int integer2 = integer1;
        int integer3 = integer1.intValue(); // same, in old versions
        System.out.println(integer2);
    }
}
