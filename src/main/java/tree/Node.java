package tree;

public class Node<Gen> {
    public Gen value;
    public Node left;
    public Node right;

    public Node(Gen value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }


}
