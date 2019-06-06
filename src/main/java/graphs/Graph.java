package graphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    public Node addNode(String val) {
        Node node = new Node(val);
        // logic
        return node;
    }

    public void addEdge(Node node1, Node node2) {

    }

    public List<Node> getNodes() {
        List<Node> allNodes = new ArrayList<>();


        return allNodes;
    }

    public int size() {
        int all = 0;

        return all;
    }

    public List<Node> bredth(Node start) {
        List<Node> results = new ArrayList<>();


        return results;
    }

    public Pair getEdge(Graph cities, String[] flightPath) {
        boolean isDirect = false;
        int cost = 0;
        Pair results = new Pair(isDirect, cost);

        return results;
    }

    public List<Node> depth(List<Node> adj) {
        List<Node> results = new ArrayList<>();

        return results;
    }
}
