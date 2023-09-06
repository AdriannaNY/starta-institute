package adds.algorithms.lesson4;

public class FibonacciRecurse {
    public static void main(String[] args) throws Exception{
        System.out.println(fibonacci(5)); // Fibonacci. Iteration. From left to right. f(3)=f(1)+f(2)
    } // Fibonacci 0,1,1,2,3,5,8,... Better use iteration method, fast, big O = O(n)
    public static int fibonacci(int n) throws Exception{
        if (n <= 0) throw new Exception("The number should be positive");
        if (n == 1) return 0; // base case
        if (n == 2) return 1; // base case
        int sum = 0;
        int sum1 = 0;
        int sum2 = 1;
        for (int i = 3; i <= n; i++) {
            sum = sum1 + sum2;
            sum1 = sum2;
            sum2 = sum;
        }
        return sum;  // 5
    }
}
