package lesson23.task5;

public class Main {

    public static void main(String[] args) {

        Long l = 7387L;
        Integer i = 234;
        Float f = 34.45f;
        Double d = 123.5;
        Byte b = 100;
        String s = "Hello";

//        NumberUtils.printIntegerValue(l); // 7387
//        NumberUtils.printIntegerValue(i); // 234
//        NumberUtils.printIntegerValue(f); // 34
//        NumberUtils.printIntegerValue(d); // 123
//        NumberUtils.printIntegerValue(b); // 100
//        NumberUtils.printIntegerValue(s); // ClassCastException

        // If we make method printIntegerValue not static, we must create objects to call method:

        NumberUtils<Long> utils = new NumberUtils(l);
        NumberUtils<Integer> utils1 = new NumberUtils(i);
        NumberUtils<Float> utils2 = new NumberUtils(f);
        NumberUtils<Double> utils3 = new NumberUtils(d);
        NumberUtils<Byte> utils4 = new NumberUtils(b);
//        NumberUtils<String> utils5 = new NumberUtils(s); // wrong type, not extends from Number
        // will see this error immediately in our code during compilation step

        utils.printIntegerValue(); // 7387
        utils1.printIntegerValue(); // 234
        utils2.printIntegerValue(); // 34
        utils3.printIntegerValue(); // 123
        utils4.printIntegerValue(); // 100
//        utils.printIntegerValue(); // ClassCastException

    }
}
