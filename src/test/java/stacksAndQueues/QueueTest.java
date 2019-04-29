package stacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void testQueueConstructor() {
        Queue q = new Queue();
        Queue x = new Queue();

        assertTrue(q.front == null);
        assertTrue(q.back == null);
        assertTrue(x.front == null);
        assertTrue(x.back == null);

    }

    @Test
    public void testEnquque() {
        Queue q = new Queue();

        assertTrue(q.front == null);
        assertTrue(q.back == null);

        q.enquque(4);

        assertEquals(q.front.value, 4);
        assertEquals(q.back.value, 4);

        q.enquque(9);

        assertEquals(q.back.value, 9);

        q.enquque(12);

        assertEquals(q.back.value, 12);


    }

    @Test
    public void testDequque() {
        Queue q = new Queue();
        q.enquque(2);
        q.enquque(4);
        q.enquque(8);
        q.enquque(6);
        assertEquals(q.front.value, 2);
        assertEquals(q.back.value, 6);

        assertEquals(q.dequque(), 2);
        assertEquals(q.dequque(), 4);
        assertEquals(q.dequque(), 8);
    }

    @Test
    public void testPeek() {
        Queue q = new Queue();
        q.enquque(8);

        assertEquals(q.peek(), 8);

        q.enquque(78);
        assertEquals(q.peek(), 8);

        q.dequque();
        assertEquals(q.peek(), 78);

        q.enquque(16);
        q.dequque();
        assertEquals(q.peek(), 16);


    }

}