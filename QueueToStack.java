import java.util.LinkedList;

public class QueueToStack extends Skeleton {//extends Skeleton because it must use abstraction to appear in the menu properly


    //creating a queue (q) and a stack (s)
    LinkedList<Integer> q = new LinkedList<>();
    LinkedList<Integer> s = new LinkedList<>();
    LinkedList<String> qq = new LinkedList<>();
    LinkedList<String> ss = new LinkedList<>();


    //initializing the queue
    public QueueToStack(String t) {
        super(t);
        q.add(1);
        q.add(2);
        q.add(3);
        qq.add("first");
        qq.add("second");
        qq.add("third");
        qq.add("fourth");
        qq.add("fifth");
        qq.add("sixth");
    }

    public void run() {
        System.out.println("We start with a queue: " + q);
        System.out.println("The elements of the queue will now be placed into a stack.");
        
        //this method uses LIFO because new elements are added at the head
        for (int i = 0; i < q.size(); i++) {
            s.add(0, q.get(i));
        }
        System.out.println("Stack, in the reverse order of the queue: " + s);
        System.out.println();
        System.out.println("We start with a queue: " + qq);
        System.out.println("The elements of the queue will now be placed into a stack.");
        
        //this method uses LIFO because new elements are added at the head
        for (int i = 0; i < qq.size(); i++) {
            ss.add(0, qq.get(i));
        }
        System.out.println("Stack, in the reverse order of the queue: " + ss);
    }
}
