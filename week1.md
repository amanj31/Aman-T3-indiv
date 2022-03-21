# Week 1:

**Individual Grade: 3/4**

**Team Grade: 1/1**

**Overall Grade: 4/5**

[Review Ticket](https://github.com/amanj31/Aman-T3-indiv/issues/2)

Runtime: (found on Repl) [Here](https://replit.com/@AmanJain25/Aman-T3-indiv#Main.java)

### Key Learnings: 

* A Linked List is a data structure in which pieces of data are linked by nodes and ordered from head to tail. It is a linear data structure. New objects are inserted at the tail.
* An empty linked list only has null, and the last element of any linked list points to null.
* A Queue is FIFO (first in first out).
* Queues are data structures like a normal line people wait in, can be created with a linked list.
* Queue and Dequeue are add and remove (add to the tail, remove from the front)
* Stacks are like a stack of plates (LIFO): last in first out.
* These can also be built with a linked list, but the tail has to be treated as the for removal. 
* Push and pop are add and remove (add and remove from the head)

Code links:
[Creating a Queue](https://github.com/amanj31/Aman-T3-indiv/blob/main/CreatingQueue.java):
```
import java.util.LinkedList;

public class CreatingQueue extends Skeleton {
    static LinkedList<String> queue = new LinkedList<>();

    public CreatingQueue(String text) {
        super(text);
    }

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
```

[Merge sort](https://github.com/amanj31/Aman-T3-indiv/blob/main/MergeSort.java):
```
import java.util.LinkedList;

public class MergeSort extends Skeleton {

    LinkedList<Integer> a = new LinkedList<>();
    LinkedList<Integer> b = new LinkedList<>();
    LinkedList<Integer> c = new LinkedList<>();

    public MergeSort(String t) {
        super(t);
        a.add(1);
        a.add(4);
        a.add(5);
        a.add(8);
        b.add(2);
        b.add(3);
        b.add(6);
        b.add(7);
    }

    public void run() {
        System.out.println("The lists a and b will be sorted.");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        while (a.size() > 0 || b.size() > 0) {
            if (a.size() == 0) {
                c.add(b.getFirst());
                b.removeFirst();
            } else if (b.size() == 0) {
                c.add(a.getFirst());
                a.removeFirst();
            } else {
                if (a.getFirst() > b.getFirst()) {
                    c.add(b.getFirst());
                    b.removeFirst();
                } else {
                    c.add(a.getFirst());
                    a.removeFirst();
                }
            }
        }
        System.out.println("Sorted list: " + c);

    }
    
}
```

[Queue to Stack](https://github.com/amanj31/Aman-T3-indiv/blob/main/QueueToStack.java):
```
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
```
