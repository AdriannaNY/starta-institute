package lesson28.task7;

public class ThreadA extends Thread{

    private ClassA classA;

    public ThreadA(ClassA classA){
        this.classA = classA;
    }

    @Override
    public void run() {
        classA.methodA();
    }
}
