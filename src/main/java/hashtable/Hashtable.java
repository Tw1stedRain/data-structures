package hashtable;

import java.lang.reflect.Array;

public class Hashtable<Gen> {

    protected Node[] buckets;


    public Hashtable(int buckets) {
        final Node[] temp = (Node[]) Array.newInstance(Node.class, buckets);

        this.buckets = temp;
    }

    public Hashtable() {
        this(40);
    }

    public int hash(String key) {
        char[] letters = key.toCharArray();
        int indexCalc = 0;
        for (char letter : letters) {
            indexCalc += letter;
        }
        indexCalc *= 73;
        return indexCalc % buckets.length;

    }

    public boolean add(String key, Gen val) {
        if (val == null) {
            return false;
        }

        int keyIndex = hash(key);

        Node bucketNode = buckets[keyIndex];

        if (bucketNode == null) {
            buckets[keyIndex] = new Node<>(key, val);
            return true;
        }

        if (bucketNode.key.equals(key)) {
            return false;
        }

        while (bucketNode.next != null) {
            if (bucketNode.next.key.equals(key)) {
                return false;
            }
            bucketNode = bucketNode.next;
        }
        bucketNode.next = new Node(key, val);

        return true;

    }

    public Gen get(String key) {

        int target = hash(key);
        Node<Gen> bucketNode = buckets[target];

        if (bucketNode == null) {
            return null;
        }

        if (bucketNode.key.equals(key)) {
            return bucketNode.val;
        }

        while (bucketNode.next != null) {
            if (bucketNode.next.key.equals(key)) {
                return (Gen) bucketNode.next.val;
            }
        }

        return null;
    }

    public boolean contains(String key) {
        return (get(key) != null);
    }

}
