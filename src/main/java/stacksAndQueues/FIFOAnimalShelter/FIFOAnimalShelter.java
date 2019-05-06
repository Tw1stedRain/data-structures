package stacksAndQueues.FIFOAnimalShelter;

import stacksAndQueues.Node;
import stacksAndQueues.Queue;

public class FIFOAnimalShelter {
    public Queue<Animal> cats;
    public Queue<Animal> dogs;


    public void enqueue(Animal animal) {
        if (animal.type == "cat") {
            cats.enquque(animal);
        } else if (animal.type == "dog") {
            dogs.enquque(animal);
        } else {
            return;
        }
    }

    public Animal dequeue(Animal animal) {


    }


}
