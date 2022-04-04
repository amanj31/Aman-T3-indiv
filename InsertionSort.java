import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class InsertionSort {
    ArrayList<Integer> data = new ArrayList<>();
    Duration timeElapsed;
    // int swaps;
    // int comparisons;

    public InsertionSort(int dataSize) {
        for (int i = 0; i < dataSize; i++) {
            data.add((int) (Math.random() * dataSize * 10));
        }
        // swaps = 0;
        // comparisons = 0;
    }

    public InsertionSort(ArrayList<Integer> k) {
        data = k;
        // swaps = 0;
        // comparisons = 0;
    }

    public void sort() {
        Instant start = Instant.now();
        int size = data.size();
        for (int j = 1; j < size; j++) {
            int currentDatum = data.get(j);
            int topIndex = j - 1;
            while (topIndex > -1 && data.get(topIndex) > currentDatum) {
                //comparisons += 1;
                //System.out.println("asdasdda " + comparisons);
                data.set(topIndex + 1, data.get(topIndex));
                topIndex -= 1;
            }
            data.set(topIndex + 1, currentDatum);
            // swaps += 1;
        }
        Instant end = Instant.now();
        timeElapsed = Duration.between(start, end);
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }

    // public int getSwaps() {
    //     return swaps;
    // }

    // public int getComparisons() {
    //     return comparisons;
    // }

}
