import java.util.LinkedList;

public class CreatingQueue extends Skeleton { //extends Skeleton because it must use abstraction to appear in the menu properly
    static LinkedList<String> queue = new LinkedList<>();

    public CreatingQueue(String text) {
        super(text);
    }


    //enqueue method uses the add() function built in to Linked-Lists. This adds the element to the tail.
    public static void enqueue(String s) {
        queue.add(s);
        System.out.println("Enqueued data: " + s);
        System.out.println("Words count: " + queue.size());
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.get(i) + " ");
        }
        System.out.println();
        System.out.println();
    }


    //dequeue method uses the removeFirst() method built into Linked Lists. This method removes the head and also returns its data.
    public static void dequeue() {
        System.out.println("Dequeued data: " + queue.removeFirst());
        System.out.println("Words count: " + queue.size());
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.get(i) + " ");
        }
        System.out.println();
        System.out.println();

    }

    public void run() {
        enqueue("seven");
        enqueue("slimy");
        enqueue("snakes");
        enqueue("sallying");
        enqueue("slowly");
        enqueue("slithered");
        enqueue("southward");
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
    }


}
