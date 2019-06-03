package hashtable;

public class Node<Gen> {

    public String key;

    public Gen val;
    public Node next;


    public Node(String key, Gen val) {
        this.key = key;
        this.val = val;
    }
}
