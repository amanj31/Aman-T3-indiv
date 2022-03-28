import java.util.LinkedList;

public class Stack {
    LinkedList<Object> s;

    public Stack(LinkedList a) {
        s = a;
    }

    public void push(Object x) {
        s.add(0, x);
    }

    public void pop() {
        s.removeFirst();
    }

    public Object peek() {
        return(s.getFirst());
    }

    public int size() {
        return(s.size());
    }
}
