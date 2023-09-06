package adds.algorithms.lesson4;

public class ArithmeticRecurse {
    public static void main(String[] args) throws Exception{
        System.out.println(progression(5)); // Arithmetic progression. Recurse. From right to left. S5 = S4 + 5 etc...
    }
    public static int progression(int n) throws Exception{
        if (n <= 0) throw new Exception("The number should be positive");
        if (n == 1) return 1; // base case
        return progression(n-1) + n;  // 15
    }
}
