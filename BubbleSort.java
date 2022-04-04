import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class BubbleSort {
    ArrayList<Integer> data = new ArrayList<>();
    Duration timeElapsed;
    int swaps;
    int comparisons;

    public BubbleSort(int dataSize) {
        for (int i = 0; i < dataSize; i++) {
            data.add((int) (Math.random() * dataSize * 10));
        }
        swaps = 0;
        comparisons = 0;
    }

    public BubbleSort(ArrayList<Integer> k) {
        data = k;
        swaps = 0;
        comparisons = 0;
    }

    public void sort() {
        Instant start = Instant.now();
        int size = data.size();
        for (int i = 0; i < size - 1; i++) {
            //iterates through the list a sufficient number of times
            boolean isSwap = false;
            for (int j = 0; j < size - 1 - i; j++) {
                comparisons += 1;
                if (data.get(j) > data.get(j + 1)) {
                    //swaps adjacent if they are in the wrong order
                    int keeper = data.get(j);
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, keeper);
                    isSwap = true;
                    swaps += 1;
                }
            }
            if (isSwap == false) {
                break;
            }
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
