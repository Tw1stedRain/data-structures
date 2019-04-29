package stacksAndQueues;


public class Stack<Generic> {
    public Node<Generic> top;


    public Stack() {
        this.top = null;
    }

    public void push(Generic value) {
        if (top == null) {
            top = new Node<>(value, null);
        }
        Node<Generic> next = new Node<>(value, top);
        top = next;
    }

    public Generic pop() {
        if (top == null) {
            return null;
        }
        Generic result = top.value;
        top = top.next;
        return result;
    }

    public Generic peek() {
        if (top == null) {
            return null;
        }
        return top.value;
    }
}
