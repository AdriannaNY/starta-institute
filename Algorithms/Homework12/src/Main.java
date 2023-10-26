public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree(5);
        tree.insert(3);
        tree.insert(1);
        tree.insert(7);
        tree.insert(9);
        tree.insert(8);

        //       5
        //     3   7
        //   1       9
        //         8

        System.out.println(tree.value);   // 5
        System.out.println(tree.left.value);   // 3

        System.out.println(tree.right.right.left.value);   // 8
        System.out.println(tree.find(8));   // true
        System.out.println(tree.countNodes(tree));   // 6
        System.out.println(tree.countNodes(tree.right));   // 3
        System.out.println(tree.calculateHeight(tree));   // 4
        System.out.println(tree.calculateHeight(tree.right));   // 3

        System.out.println(tree.delete(8));   // Success

        System.out.println(tree.right.right.left);   // null
        System.out.println(tree.find(8));   // false
        System.out.println(tree.countNodes(tree));   // 5
        System.out.println(tree.countNodes(tree.right));   // 2
        System.out.println(tree.calculateHeight(tree));   // 3
        System.out.println(tree.calculateHeight(tree.right));   // 2


    }
}