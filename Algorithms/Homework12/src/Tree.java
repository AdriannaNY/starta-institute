public class Tree {
    int value;
    Tree left;
    Tree right;

    public Tree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void insert(int value) {

        Tree current = this;

        while (true) {
            if (value < current.value) {

                if (current.left != null) current = current.left;
                else {
                    current.left = new Tree(value);
                    return;
                }
            } else {
                if (current.right != null) current = current.right;
                else {
                    current.right = new Tree(value);
                    return;
                }
            }
        }
    }

    public boolean find(int value) {
        Tree current = this;
        while (true) {
            if (value == current.value) return true;
            if (value < current.value) {
                if (current.left != null) current = current.left;
                else return false;
            } else {
                if (current.right != null) current = current.right;
                else return false;
            }
        }
    }

    public String delete(int value) {
        Tree current = this;
        while (true) {
            if (value < current.value) {
                if (current == null) return "Not found";
                if (value == current.left.value) {
                    current.left = null;
                    return "Success";
                }
                current = current.left;
            } else {
                if (current == null) return "Not found";
                if (value == current.right.value) {
                    current.right = null;
                    return "Success";
                }
                current = current.right;
            }
        }
    }

    public int countNodes(Tree node) {   // use recursion
        if (node == null) return 0;
        return 1 + this.countNodes(node.left) + this.countNodes(node.right);
    }

    public int calculateHeight(Tree node) {   // use recursion
        if (node == null) return 0;
        int leftHeight = this.calculateHeight(node.left);
        int rightHeight = this.calculateHeight(node.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }


}


