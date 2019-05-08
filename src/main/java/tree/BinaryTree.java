package tree;

import java.util.ArrayList;

public class BinaryTree<Gen> {
    public Node<Gen> root;

    public BinaryTree() {
        this.root = null;
    }

    public ArrayList<Gen> preOrder() {
        ArrayList<Gen> output = new ArrayList<>();
        recallPreOrder(this.root, output);
        return output;

    }

    private void recallPreOrder(Node<Gen> node, ArrayList<Gen> output) {
        output.add(node.value);
        if (node.left != null) {
            recallPreOrder(node.left, output);
        }
        if (node.right != null) {
            recallPreOrder(node.right, output);
        }
    }

    public ArrayList<Gen> inorder() {
        ArrayList<Gen> output = new ArrayList<>();
        recallInOrder(this.root, output);
        return output;
    }

    private void recallInOrder(Node<Gen> node, ArrayList<Gen> output) {
        if (node.left != null) {
            recallInOrder(node.left, output);
        }
        output.add(node.value);
        if (node.right != null) {
            recallInOrder(node.right, output);
        }
    }

    public ArrayList<Gen> postOrder() {
        ArrayList<Gen> output = new ArrayList<>();
        recallPostOrder(this.root, output);
        return output;
    }

    private void recallPostOrder(Node<Gen> node, ArrayList<Gen> output) {
        if (node.left != null) {
            recallPostOrder(node.left, output);
        }
        if (node.right != null) {
            recallPostOrder(node.right, output);
        }
        output.add(node.value);
    }

    public void bredth(BinaryTree tree) {

    }
}
