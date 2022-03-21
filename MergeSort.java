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
