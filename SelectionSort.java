import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class SelectionSort {
    ArrayList<Integer> data;
    Duration timeElapsed;
    int swaps;
    int comparisons;

    public SelectionSort(int dataSize) {
        for (int i = 0; i < dataSize; i++) {
            data.add((int) (Math.random() * dataSize * 10));
        }
        swaps = 4999;
        comparisons = 0;
    }

    public SelectionSort(ArrayList<Integer> k) {
        data = k;
        swaps = 4999;
        comparisons = 0;
    }

    public void sort() {
        Instant start = Instant.now();
        int size = data.size();
        for (int j = 0; j < size - 1; j++) {
            int smallestIndex = j;
            for (int k = j + 1; k < size; k++) {
                comparisons += 1;
                if (data.get(k) < data.get(smallestIndex)) {
                    smallestIndex = k;
                }
            }
            int qq = data.get(smallestIndex);
            data.set(smallestIndex, data.get(j));
            data.set(j, qq);
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

    public int getSwaps() {
        return swaps;
    }

    public int getComparisons() {
        return comparisons;
    }

}


