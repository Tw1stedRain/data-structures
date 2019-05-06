package tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void testBinaryTreeConstructor() {
        BinaryTree t = new BinaryTree();
        BinaryTree b = new BinaryTree();
        BinaryTree x = new BinaryTree();

        assertNull(t.root);
        assertNull(b.root);
        assertNull(x.root);
    }

    @Test
    public void testPreOrder() {
        BinaryTree t = new BinaryTree();
        ArrayList<String> output = new ArrayList<>();
        output.add("a");
        output.add("b");
        output.add("d");
        output.add("e");
        output.add("c");
        output.add("f");


        t.root.value = "a";
        t.root.left.value = "b";
        t.root.left.left.value = "d";
        t.root.left.right.value = "e";
        t.root.right.value = "c";
        t.root.right.left.value = "f";

        assertEquals(output, t.preOrder());
    }
}
