package lesson2.task2;

public class Dog extends LandAnimal{
    //we must override all abstract methods from parent classes
    @Override
    public void voice() {
        System.out.println("Gav!");
    }
    @Override
    public void move() {
    }

    @Override
    public void live() {

    }
}
