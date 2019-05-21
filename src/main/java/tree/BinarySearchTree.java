package tree;

public class BinarySearchTree {
    public Node<Integer> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public Node<Integer> add(Node<Integer> root, int val) {
        if (root == null) {
            root = new Node<>(val, null, null);
            return root;
        }
        if (val < root.value) {
            root.left = add(root.left, val);
        } else if (val > root.value) {
            root.right = add(root.right, val);
        }
        return root;

    }

    public Boolean contains(Node<Integer> node, int val) {
        while (node.value != val) {
            if (node.value == null) {
                return false;
            }
            if (node.value == val) {
                return true;
            }
            if (node.value > val) {
                contains(node.left, val);
            }
            if (node.value < val) {
                contains(node.right, val);
            }
        }
        return false;
    }
}
