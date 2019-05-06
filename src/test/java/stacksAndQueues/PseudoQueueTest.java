package stacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void testPQConstructor() {
        PseudoQueue p = new PseudoQueue();
        PseudoQueue q = new PseudoQueue();

        assertNull(p.main.top);
        assertNull(p.holder.top);

        assertNull(q.main.top);
        assertNull(q.holder.top);
    }

    @Test
    public void testEnqueue() {
        PseudoQueue p = new PseudoQueue();

        assertNull(p.main.top);
        assertNull(p.holder.top);

        p.enqueue(8);
        assertEquals(p.main.top.value, 8);

        p.enqueue(12);
        assertEquals(p.main.top.value, 12);

        p.enqueue(72);
        assertEquals(p.main.top.value, 72);
    }

    @Test
    public void testDequeue() {
        PseudoQueue p = new PseudoQueue();
        p.enqueue(29);
        p.enqueue(24);
        p.enqueue(89);
        p.enqueue(6);
        assertEquals(p.main.top.value, 6);

        assertEquals(29, p.dequeue());
        assertEquals(24, p.dequeue());
        assertEquals(89, p.dequeue());
    }


}