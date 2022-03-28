import java.util.LinkedList;

public class Queue {
    LinkedList<Object> q;

    public Queue(LinkedList r) {
        q = r;
    }

    public void enqueue(Object a) {
        q.add(a);
    }

    public void dequeue() {
        q.removeFirst();
    }


}
