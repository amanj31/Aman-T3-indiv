import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class MergeSort {
    ArrayList<Integer> data = new ArrayList<>();
    Duration timeElapsed;
    // static int recurseDepth = 0;

    public MergeSort(int dataSize) {
        for (int i = 0; i < dataSize; i++) {
            data.add((int) (Math.random() * dataSize * 10));
        }
    }

    public MergeSort(ArrayList<Integer> k) {
        data = k;
    }

    // public MergeSort sort() {
    //     //if (recurseDepth > 20) {return new MergeSort(0);}
    //     Instant start = Instant.now();
    //     int size = data.size();
    //     ArrayList<Integer> firstHalf = new ArrayList<>();
    //     for (int i = 0; i < size / 2; i++) {
    //         firstHalf.add(data.get(0));
    //         data.remove(0);
    //     }
    //     //System.out.println(firstHalf.size());
    //     //System.out.println(data.size());
    //     MergeSort fHalf = new MergeSort(firstHalf);
    //     MergeSort sHalf = new MergeSort(data);
    //     if (firstHalf.size() > 2){
    //         recurseDepth += 1;
    //         fHalf.sort();
    //     }
    //     if (data.size() > 2){
    //         recurseDepth += 1;
    //         sHalf.sort();
    //     }
    //     MergeSort last = merge(fHalf, sHalf);
    //     Instant end = Instant.now();
    //     last.setTimeElapsed(Duration.between(start, end));
    //     System.out.println(firstHalf);
    //     System.out.println(data);
    //     System.out.println(last.getData());
    //     return last;
    // }

    // public MergeSort merge(MergeSort x, MergeSort y) {
    //     ArrayList<Integer> output = new ArrayList<>();
    //     while ((x.getData()).size() > 0 || (y.getData()).size() > 0) {
    //         if ((x.getData().size()) == 0) {
    //             output.add((y.getData()).get(0));
    //             (y.getData()).remove(0);
    //         } else if ((y.getData()).size() == 0) {
    //             output.add((x.getData()).get(0));
    //             (x.getData()).remove(0);
    //         } else {
    //             if ((x.getData()).get(0) > ((y.getData()).get(0))) {
    //                 output.add((y.getData()).get(0));
    //                 (y.getData()).remove(0);
    //             } else {
    //                 output.add((x.getData()).get(0));
    //                 (x.getData()).remove(0);
    //             }
    //         }
    //     }
    //     MergeSort z = new MergeSort(output);
    //     return z;
    // }


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

    public void sort() {
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
