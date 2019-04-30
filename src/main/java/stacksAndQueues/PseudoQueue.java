package stacksAndQueues;

public class PseudoQueue<Gen> {

    public Stack<Gen> main;
    public Stack<Gen> holder;

    public PseudoQueue() {
        this.main = new Stack<>();
        this.holder = new Stack<>();
    }


    public void enqueue(Gen value) {
        main.push(value);
    }

    public Gen dequeue() {
        while (main.peek() != null) {
            holder.push(main.pop());
        }
        Gen result = holder.pop();
        while (holder.peek() != null) {
            main.push(holder.pop());
        }
        return result;
    }
}
