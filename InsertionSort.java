import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class InsertionSort {
    ArrayList<Integer> data = new ArrayList<>();
    Duration timeElapsed;

    public InsertionSort(int dataSize) {
        for (int i = 0; i < dataSize; i++) {
            data.add((int) (Math.random() * dataSize * 10));
        }
    }

    public InsertionSort(ArrayList<Integer> k) {
        data = k;
    }

    public void sort() {
        Instant start = Instant.now();
        int size = data.size();
        for (int j = 1; j < size; j++) {
            int currentDatum = data.get(j);
            int topIndex = j - 1;
            while (topIndex > -1 && data.get(topIndex) > currentDatum) {
                data.set(topIndex + 1, data.get(topIndex));
                topIndex -= 1;
            }
            data.set(topIndex + 1, currentDatum);
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


}
