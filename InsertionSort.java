import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class InsertionSort {
    ArrayList<Integer> data = new ArrayList<>();
    Duration timeElapsed;
    int swaps;
    int comparisons;

    public InsertionSort(int dataSize) {
        for (int i = 0; i < dataSize; i++) {
            data.add((int) (Math.random() * dataSize * 10));
        }
        swaps = 4999;
        comparisons = 0;
    }

    public InsertionSort(ArrayList<Integer> k) {
        data = k;
        swaps = 4999;
        comparisons = 0;
    }

    public void sort() {
        Instant start = Instant.now();
        int size = data.size();
        for (int j = 1; j < size; j++) {
            int currentDatum = data.get(j);
            int topIndex = j - 1;
            while (topIndex > -1 && data.get(topIndex) > currentDatum) {
                //goes through the first j and places the j + 1 element in the right place, shifting everything in front of it up one spot
                data.set(topIndex + 1, data.get(topIndex));
                topIndex -= 1;
                comparisons += 1;
            }
            data.set(topIndex + 1, currentDatum);
        }
        Instant end = Instant.now();
        timeElapsed = Duration.between(start, end);
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public long getTimeElapsed() {
        return timeElapsed.toNanos();
    }

    public int getSwaps() {
        return swaps;
    }

    public int getComparisons() {
        return comparisons;
    }

}
