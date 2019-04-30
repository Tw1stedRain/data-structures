package stacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testStackConstructor() {
        Stack s = new Stack();
        Stack x = new Stack();
        Stack z = new Stack();

        assertTrue(s.top == null);
        assertTrue(x.top == null);
        assertTrue(z.top == null);

    }

    @Test
    public void testPush() {
        Stack s = new Stack();

        assertTrue(s.top == null);

        s.push(2);
        assertEquals(s.top.value, 2);

        s.push(4);
        assertEquals(s.top.value, 4);

        s.push(14);
        assertEquals(s.top.value, 14);

    }

    @Test
    public void testPop() {
        Stack s = new Stack();
        s.push(7);
        s.push(5);
        s.push(2);
        s.push(6);
        assertEquals(s.top.value, 6);

        s.pop();
        assertEquals(s.top.value, 2);
        s.pop();
        assertEquals(s.top.value, 5);
        s.pop();
        assertEquals(s.top.value, 7);
    }

    @Test
    public void testPeek() {
        Stack s = new Stack();
        s.push(5);

        assertEquals(s.peek(), 5);

        s.push(7);
        assertEquals(s.peek(), 7);

        s.push(98);
        assertEquals(s.peek(), 98);

    }


    @Test
    public void testPopBug() {
        Stack stack = new Stack();
        stack.push(7);
        stack.push(8);

        assertEquals(8, stack.pop());
        assertEquals(7, stack.peek());

        assertEquals(7, stack.pop());
        assertEquals(null, stack.peek());
    }

}

