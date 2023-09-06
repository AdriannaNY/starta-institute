package lesson10.task1;

public class PrimitiveComparing {
    public static void main(String[] args) {
        int a = 5; // primitive
        int b = 10; // primitive
        int c = 5; // primitive

        // For primitives - comparing = comparing of it's values
        boolean result = a == b;
        System.out.println("The result of comparing primitives a and b: " + result);  // false

        result = a == c;
        System.out.println("The result of comparing primitives a and c: " + result); // true

        Integer i = 5;  // variable of class - shale = object, have link
        result = a == i;
        System.out.println("The result of comparing int a and Integer i: " + result); // true
        // when comparing it - автораспаковка (преобразовали Integer к int)

        Integer i1 = new Integer(5); // deprecated, old versions
        result = i == i1;
        System.out.println("The result of comparing Integers i and i1: " + result); // false, because 2 different objects
        // but if Integer i1 = 5; // result will true

        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.print("The result of comparing String s1 and s2: ");
        System.out.println(s1 == s2); // false // if String s2 = "Hello" --> true
        // if String s2 = new String(s2); - deprecated  // result will false, because we created new different object
        // operator == compare links. Links of 2 different objects - different --> will false --> must use equals for comparing

        System.out.println("The result of comparing Strings using method equals: " + s1.equals(s2)); // true
        // method equals compare values of Strings even if their links - different

        String s3 = "Java";
        String s4 = "Java"; // now s3 and s4 - have same link

        s4 = s4 + "!"; // when we changed s4 - was created new object with another link
        System.out.println(s3); // when we changed s4 - s3 didn't change because they have different links


    }
}
