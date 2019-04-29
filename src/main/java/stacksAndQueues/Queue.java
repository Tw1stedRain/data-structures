package stacksAndQueues;

public class Queue<Generic> {

    public Node<Generic> front;
    public Node<Generic> back;

    public Queue() {
        this.front = null;
        this.back = null;
    }

    public void enquque(Generic value) {
        if (front == null) {
            front = new Node<>(value, null);
            back = front;
            return;
        }
        Node<Generic> next = new Node<>(value, null);
        back.next = next;
        back = next;
    }

    public Generic dequque() {
        if (front == null) {
            return null;
        }
        Generic result = front.value;
        front = front.next;
        return result;
    }

    public Generic peek() {
        if (front == null) {
            return null;
        }
        return front.value;
    }
}
