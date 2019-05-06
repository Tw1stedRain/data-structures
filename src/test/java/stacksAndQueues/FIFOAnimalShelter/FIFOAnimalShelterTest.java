package stacksAndQueues.FIFOAnimalShelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class FIFOAnimalShelterTest {

    @Test
    public void testEnqueue() {
        FIFOAnimalShelter a = new FIFOAnimalShelter();
        Animal dog = new Animal("Scruffy", "dog");

        a.enqueue(dog);


    }


}