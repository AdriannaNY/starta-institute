package lesson2.task2;

public class Airplane implements Flyable{
    //we must override all abstract methods from parent classes
    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }
}
