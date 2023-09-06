package lesson2.task2;

public class Bird extends Animals implements Flyable{  // class Bird наследован от Animals и реализует интерфейс Flyable
    //we must override all abstract methods from parent classes/ interface
    //в отличие от наследования, возможно множественное наследование интерфейсов (через запятую)
    @Override
    public void live() {
    }

    @Override
    public void fly() {
        System.out.println("The bird is flying");
    }
    //overloading (перегруженный метод) - полиморфизм времени компиляции. В коде понятно, какой метод вызывется
    //когда методы имеют одинаковое название, но разные параметры
    public void fly(int speed) {   //Polymorphism - same method fly(), but different realisation
        System.out.println("The bird is flying with speed " + speed);
    }
}
