package lesson2.task2;

public interface Flyable {   //интерфейс позволяет обьединить сущности, имеющие общий функционал: самолет и птица умеют летать
    // interface can exstends from interface
    //переменные, обьявленные в интерфейсе, являются окончательными - final
    void fly();   //method fly() here in interface is public and abstract by default
}
