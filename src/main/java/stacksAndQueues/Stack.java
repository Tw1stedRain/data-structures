package stacksAndQueues;


public class Stack<Generic> {
    public Node<Generic> top;


    public Stack() {
        this.top = null;
    }

    public void push(Generic value) {
        if (this.top == null) {
            this.top = new Node<>(value, null);
        } else {
            Node<Generic> next = new Node<>(value, this.top);
            this.top = next;
        }
    }

    public Generic pop() {
        if (this.top == null) {
            return null;
        }
        Generic result = this.top.value;
        this.top = this.top.next;
        return result;
    }

    public Generic peek() {
        if (this.top == null) {
            return null;
        }
        return this.top.value;
    }
}
