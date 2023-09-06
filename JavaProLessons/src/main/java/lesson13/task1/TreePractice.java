package lesson13.task1;

public class TreePractice {
    public static void main(String[] args) {
        //             10
        //      2             13
        //   1     6      12     81
        //       5

        MyBinaryTree tree = new MyBinaryTree();
        tree.add(10, "Node 10");
        tree.add(2, "Node 2");
        tree.add(13, "Node 13");
        tree.add(1, "Node 1");
        tree.add(6, "Node 6");
        tree.add(12, "Node 12");
        tree.add(81, "Node 81");
        tree.add(5, "Node 5");

        TreeUtils.breadthFirstSearch(tree); // 0 level - 1 level - 2 level - 3 level - etc...
        // Node 10 Node 2 Node 13 Node 1 Node 6 Node 12 Node 81 Node 5

        TreeUtils.depthInOrder(tree); // left - root - right
        // Node 1  Node 2  Node 5  Node 6  Node 10  Node 12  Node 13  Node 81

        TreeUtils.depthPreOrder(tree); // root - left - right
        // 10 - 2 - 1 - 6 - 5 - 13 - 12 - 81

        TreeUtils.depthPostOrder(tree); // left - right - root
        // 1 - 5 - 6 - 2 - 12 - 81 - 13 - 10



    }
}
