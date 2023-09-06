package adds.algorithms.lesson4;

public class FibonacciIteration {
    public static void main(String[] args) throws Exception{
        System.out.println(fibonacci(5)); // Arithmetic progression. Recurse. From right to left. f(n)=f(n-1)+f(n-2) etc...
    } // Fibonacci 0,1,1,2,3,5,8,... In recurse method bad big O =  O(2^n) (long time to wait result), so better use iteration method
    public static int fibonacci(int n) throws Exception{
        if (n <= 0) throw new Exception("The number should be positive");
        if (n == 1) return 0; // base case
        if (n == 2) return 1; // base case
        return fibonacci(n-1) + fibonacci(n-2);  // 3
    }
}
