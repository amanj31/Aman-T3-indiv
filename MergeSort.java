import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class MergeSort {
    ArrayList<Integer> data = new ArrayList<>();
    Duration timeElapsed;
    int swaps;
    int comparisons;

    public MergeSort(int dataSize) {
        for (int i = 0; i < dataSize; i++) {
            data.add((int) (Math.random() * dataSize * 10));
        }
        swaps = 0;
        comparisons = 0;
    }

    public MergeSort(ArrayList<Integer> k) {
        data = k;
        swaps = 0;
        comparisons = 0;
    }

    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> output = new ArrayList<>();
        while (a.size() > 0 || b.size() > 0) {
            if (a.size() == 0) {
                output.add(b.get(0));
                b.remove(0);
            } else if (b.size() == 0) {
                output.add(a.get(0));
                a.remove(0);
            } else {
                if (a.get(0) > b.get(0)) {
                    output.add(b.get(0));
                    b.remove(0);
                } else {
                    output.add(a.get(0));
                    a.remove(0);
                }
            }
        }
        return output;
    }

    public ArrayList<Integer> divide(ArrayList<Integer> t) {
        ArrayList<Integer> s = new ArrayList<>();
        int size = t.size();
        if (size > 1) {
            for (int f = 0; f < size / 2; f++) {
                s.add(t.get(0));
                t.remove(0);
            }
            
            return merge(divide(s), divide(t)); 
        } else {
            return t;
        }
    }

    public void mort() {
        Instant start = Instant.now();
        data = divide(data);
        Instant end = Instant.now();
        timeElapsed = Duration.between(start, end);
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public void setData(ArrayList<Integer> r) {
        data = r;
    }

    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }

    public void setTimeElapsed(Duration w) {
        timeElapsed = w;
    }


}
