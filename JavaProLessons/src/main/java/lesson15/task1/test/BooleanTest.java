package lesson15.task1.test;

public class BooleanTest {
    public static void main(String[] args) {
        // Case 1. true true
//        int b = 1;
//        int c = 5;

        // Case 2. true false
//        int b = 1;
//        int c = 6;

        // Case 3. false true
//        int b = 0;
//        int c = 5;

        // Case 4. false false
        int b = 0;
        int c = 6;

        // Methods test1 and test2 - work same
        System.out.println(test1(b, c)); // Cases 1, 2, 3 - false; Case 4 - true
        System.out.println(test2(b, c)); // Cases 1, 2, 3 - false; Case 4 - true
    }

    public static boolean test1(int b, int c) {
        return  !((b != 0) || (c <= 5));
        // Case 1. true true --> !(true || true) --> !true --> false
        // Case 2. true false --> !(true || false) --> !true --> false
        // Case 3. false true --> !(false || true) --> !true --> false
        // Case 4. false false --> !(false || false) --> !false --> true
    }

    public static boolean test2(int b, int c) {
        return  (b == 0) && (c > 5);
        // Case 1. false false --> false && false --> false
        // Case 2. false true --> false && true --> false
        // Case 3. true false --> true && false --> false
        // Case 4. true true --> true && true --> true
    }
}
