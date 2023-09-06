package adds.algorithms.lesson4;

public class HanoiTowerRecurse {
    public static void main(String[] args) throws Exception {
        Hanoi(3, 'A', 'C', 'B');
    }

    public static void Hanoi(int n, char A, char C, char B) throws Exception {
        if (n <= 0) throw new Error("The number should be positive");
        if (n == 1) {
            System.out.println(A + "-->" + C);
        } else {
            Hanoi(n - 1, A, B, C);
            System.out.println(A + "-->" + C);
            Hanoi(n - 1, B, C, A);
        }
    }
}
