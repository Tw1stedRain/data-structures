package graphs;

import java.util.List;

public class Node<Gen> {

    public String val;
    public List<Node> neighbors;

    public Node(String val) {
        this.val = val;
    }

}
