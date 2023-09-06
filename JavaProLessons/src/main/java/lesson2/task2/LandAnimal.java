package lesson2.task2;

public abstract class LandAnimal extends Animals {   // Subclass of superclass Animal and Superclass for classes Dog,Cat.Cow
    // in abstract class we can't create objects

    //we must override all abstract methods from parent classes
//    @Override      //we write it if it's common for all subclasses
//    public void live() {
//        System.out.println("Animal is living");
//    }

    protected int legsCounter;   //if private - we must use Setter/Getter
    public abstract void voice();   //abstract method only in abstract class and don't have body, so должны реализовать в субклассе via @Override method
    public abstract void move();   //abstract method only in abstract class and don't have body, so должны реализовать в субклассе via @Override method

}
