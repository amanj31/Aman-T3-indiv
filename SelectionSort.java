import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {
    ArrayList<Integer> data = new ArrayList<>();
    Duration timeElapsed;

    public SelectionSort(int dataSize) {
        for (int i = 0; i < dataSize; i++) {
            data.add((int) Math.random() * dataSize);
        }
    }

}
