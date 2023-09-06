package lesson11.task1;

public class Test implements TestInterface{
    @Override
    public String test(int value) { // implementation of our method test() from TestInterface
        return "test";
    }

    public String test(int value, double value1) { // перегрузим method --> new method if we need it here in this 1 class
        // this method will not affect on other classes implemented TestInterface
        // If we want to change signature of method for all classes, we must write it in Interface TestInterface
        return "another test";
    }


    public static void main(String[] args) {
        System.out.println(new Test().test(5)); // created new object of our class Test and call method test()
        System.out.println(new Test().test(5,2.3));

    }

}
