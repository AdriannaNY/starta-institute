package lesson13.task1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeUtils {
    public static void breadthFirstSearch(MyBinaryTree tree) {  // 0 level - 1 level - 2 level - etc...

        if (tree == null || tree.isEmpty()) {
            return; // stop the method
        }

        Queue<MyBinaryTree.Node> queue = new LinkedList<>();
        queue.add(tree.getRoot());

        while (!queue.isEmpty()) {
            MyBinaryTree.Node currentNode = queue.poll();
            System.out.print(currentNode.getValue() + " ");

            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }

            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }
        System.out.println();
    }


    public static void depthInOrder(MyBinaryTree tree) { // left - root - right
        // MyBinaryTree.Node root = tree.getRoot();

        if (tree == null || tree.isEmpty()) {
            return; // stop the method
        }

        Stack<MyBinaryTree.Node> stack = new Stack<>();
        MyBinaryTree.Node current = tree.getRoot(); // current = root, in the beginning

        while (current != null || !stack.isEmpty()) {  // go through all tree

            while (current != null) { // go on left till the end
                stack.push(current); // put in stack temporary root and left element with left kids
                current = current.getLeft();
            }

            current = stack.pop(); // extract upper element of stack and delete it
            System.out.print(current.getValue() + "  ");

            current = current.getRight(); // get right element after we get left and root
        }
        System.out.println();
    }

    public static void depthPreOrder(MyBinaryTree tree) { // root - left - right

        if (tree == null || tree.isEmpty()) {
            return; // stop the method
        }

        Stack<MyBinaryTree.Node> stack = new Stack<>();
        MyBinaryTree.Node current = tree.getRoot();

        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current); // put in stack
                current = current.getLeft();
            }

            current = stack.pop(); // extract upper element of stack and delete it
            System.out.print(current.getValue() + "  ");

            current = current.getRight();
        }
        System.out.println();
    }


        public static void depthPostOrder(MyBinaryTree tree) { // left - right - root

            if (tree == null || tree.isEmpty()) {
                return; // stop the method
            }

            Stack<MyBinaryTree.Node> stack = new Stack<>();
            MyBinaryTree.Node current = tree.getRoot();

            while (current != null || !stack.isEmpty()) {

                while (current != null) {
                    stack.push(current); // put in stack
                    current = current.getLeft();
                }

                current = stack.pop(); // extract upper element of stack and delete it
                System.out.print(current.getValue() + "  ");

                current = current.getRight();
            }
        }

}
