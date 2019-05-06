package stacksAndQueues;

public class Node<Generic> {
    public Generic value;
    public Node next;

    public Node(Generic value, Node next) {
        this.value = value;
        this.next = next;
    }
}
