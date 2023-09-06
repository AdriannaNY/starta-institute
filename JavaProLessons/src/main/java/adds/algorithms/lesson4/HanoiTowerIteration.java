package adds.algorithms.lesson4;

import java.util.Stack;

class HanoiMove{
    int n;
    char source;
    char target;
    char auxiliary;

    HanoiMove(int n, char source, char target, char auxiliary) {
        this.n = n;
        this.source = source;
        this.target = target;
        this.auxiliary = auxiliary;
    }
}

public class HanoiTowerIteration {
    public static void main(String[] args) throws Exception {
        int n = 3;
        char source = 'A';
        char target = 'C';
        char auxiliary = 'B';

        Stack<HanoiMove> moves = new Stack<>();
        moves.push(new HanoiMove(n, source, target, auxiliary));

        while (!moves.empty()) {
            HanoiMove move = moves.pop();

            if (move.n == 1) {
                System.out.println(move.source + "-->" + move.target);
            } else {
                moves.push(new HanoiMove(move.n-1, move.auxiliary, move.target, move.source));
                moves.push(new HanoiMove(1, move.source, move.target, move.auxiliary));
                moves.push(new HanoiMove(move.n-1, move.source, move.auxiliary, move.target));
            }
        }


    }
}
