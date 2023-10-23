import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        SpecialStack stack = new SpecialStack();

        System.out.println(stack.isEmpty());   // true
        stack.push(100);
        stack.push(200);
        System.out.println(stack.count);   // 2
        System.out.println(stack.items);   // [100, 200]
        System.out.println(stack.size());  // 2

        stack.push(300);
        stack.push(400);
        System.out.println(stack.items);   // [100, 200, 300, 400]
        System.out.println(stack.size());  // 4

        stack.pop();
        System.out.println(stack.items);   // [100, 200, 300]

        stack.push(400);
        stack.push(500);
        stack.push(600);
        System.out.println(stack.items);   // [100, 200, 300, 400, 500, 600]
        System.out.println(stack.peek());  // 600

        System.out.println(stack.isEmpty());   // false
        stack.clear();
        System.out.println(stack.items);   // []
        System.out.println(stack.isEmpty());   // true

        stack.push(100);
        stack.push(20);
        stack.push(-3);
        stack.push(40);
        stack.push(-6);
        System.out.println(stack.items);   // [100, 20, -3, 40, -6]
        System.out.println(stack.getMin());   // -6

    }
}