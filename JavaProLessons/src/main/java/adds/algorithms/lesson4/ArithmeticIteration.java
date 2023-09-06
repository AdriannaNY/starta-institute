package adds.algorithms.lesson4;

public class ArithmeticIteration {
    public static void main(String[] args) throws Exception{
        System.out.println(progression(5));  // // Arithmetic progression. Iteration. From left to right. S5 = 1+2+3+4+5
    }
    public static int progression(int n) throws Exception{
        if (n <= 0) throw new Exception("The number should be positive");
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += i;
        }
        return sum; // 15
    }
}
