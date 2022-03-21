import java.util.LinkedList;

public class QueueToStack extends Skeleton {

    LinkedList<Integer> q = new LinkedList<>();
    LinkedList<Integer> s = new LinkedList<>();

    public QueueToStack(String t) {
        super(t);
        q.add(1);
        q.add(2);
        q.add(3);
    }

    public void run() {
        System.out.println("We start with a queue: " + q);
        System.out.println("The elements of the queue will now be placed into a stack.");
        for (int i = 0; i < q.size(); i++) {
            s.add(0, q.get(i));
        }
        System.out.println("Stack, in the reverse order of the queue: " + s);
    }
}
