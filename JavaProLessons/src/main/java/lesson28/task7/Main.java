package lesson28.task7;

public class Main {

    public static void main(String[] args) {

        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        classA.setClassB(classB);
        classB.setClassA(classA);

        ThreadA threadA = new ThreadA(classA);
        ThreadB threadB = new ThreadB(classB);

        threadA.start();
        threadB.start();
    }
}
