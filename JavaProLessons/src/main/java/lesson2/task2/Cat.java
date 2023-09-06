package lesson2.task2;

public class Cat extends LandAnimal{
    //we must override all abstract methods from parent classes
    @Override
    public void voice() {
        System.out.println("Mew!");
    }
    @Override
    public void move() {
    }

    @Override
    public void live() {
    }

}
