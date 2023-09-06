package lesson28.task7;

public class ThreadB extends Thread{
    private ClassB classB;

    public ThreadB(ClassB classB){
        this.classB = classB;
    }

    @Override
    public void run() {
        classB.methodA();
    }
}
