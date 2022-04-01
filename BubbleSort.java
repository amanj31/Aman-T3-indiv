import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class BubbleSort {
    ArrayList<Integer> data = new ArrayList<>();
    Duration timeElapsed;

    public BubbleSort(int dataSize) {
        for (int i = 0; i < dataSize; i++) {
            data.add((int) (Math.random() * dataSize * 10));
        }
    }

    public BubbleSort(ArrayList<Integer> k) {
        data = k;
    }

    public void sort() {
        Instant start = Instant.now();
        int size = data.size();
        for (int i = 0; i < size - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < size - 1 - i; j++) {
                if (data.get(j) > data.get(j + 1)) {
                    int keeper = data.get(j);
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, keeper);
                    isSwap = true;
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

    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }

}
