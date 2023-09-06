package lesson4.task4;

public class SquareTest {
    public static void main(String[] args) {
        Square square1 = new Square(5);
        Square square2 = new Square(5);
        System.out.println(square1 == square2); //false = because its 2 different objects squares for Java Machine
        System.out.println(square1.getSideLength() == square2.getSideLength()); //true: 5=5
        // But if we have more then 2 fields - it will not so simple to compare like this, so better use method equals():
        System.out.println(square1.equals(square2)); //true -> but we must override this method!



    }
}
