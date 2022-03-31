import java.util.LinkedList;

public class MergeSortExample extends Skeleton {//extends Skeleton because it must use abstraction to appear in the menu properly



    // Linked lists a and b are the original linked lists, linked list c is initially empty and will eventually contain the elements of both a and b, sorted
    LinkedList<Integer> a = new LinkedList<>();
    LinkedList<Integer> b = new LinkedList<>();
    LinkedList<Integer> c = new LinkedList<>();
    LinkedList<String> x = new LinkedList<>();
    LinkedList<String> y = new LinkedList<>();
    LinkedList<String> z = new LinkedList<>();


    //initializing and b
    public MergeSortExample(String t) {
        super(t);
        a.add(1);
        a.add(4);
        a.add(5);
        a.add(8);
        b.add(2);
        b.add(3);
        b.add(6);
        b.add(7);
        x.add("Apple");
        x.add("Banana");
        x.add("Grape");
        x.add("Mango");
        x.add("Orange");
        x.add("Raspberry");
        x.add("Watermelon");
        y.add("Broccoli");
        y.add("Carrot");
        y.add("Cucumber");
        y.add("Lettuce");
        y.add("Potato");
        y.add("Tomato");
    }

    public void run() {
        System.out.println("The lists a and b will be sorted in numerical order.");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        while (a.size() > 0 || b.size() > 0) { //this means there are still elements left to be sorted
            if (a.size() == 0) {//if a is empty then b has the only remaining elements
                c.add(b.getFirst());
                b.removeFirst();
            } else if (b.size() == 0) {//similarly if b is empty then a has the only remaining elements
                c.add(a.getFirst());
                a.removeFirst();
            } else {
                if (a.getFirst() > b.getFirst()) {//"peeking" at the head of both a and b, to compare them
                    c.add(b.getFirst());
                    b.removeFirst();
                } else {
                    c.add(a.getFirst());
                    a.removeFirst();
                }
            }
        }
        System.out.println("Sorted list: " + c);
        System.out.println();
        System.out.println(1);

        System.out.println("The lists x and y will be sorted in alphabetical order.");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        while (x.size() > 0 || y.size() > 0) { //this means there are still elements left to be sorted
            if (x.size() == 0) {//if a is empty then b has the only remaining elements
                z.add(y.getFirst());
                y.removeFirst();
            } else if (y.size() == 0) {//similarly if b is empty then a has the only remaining elements
                z.add(x.getFirst());
                y.removeFirst();
            } else {
                if ((x.getFirst()).compareTo(y.getFirst()) >= 0) {
                    z.add(y.getFirst());
                    y.removeFirst();
                } else {
                    z.add(x.getFirst());
                    x.removeFirst();
                }
            }
        }
        System.out.println(1);
        System.out.print("Sorted list: ");
    }
    
}
