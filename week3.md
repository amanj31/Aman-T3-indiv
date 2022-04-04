# Week 3:

**Overall Grade:**

**Graded by:**

**Individual Grade:**

**Team Grade:**

[Review Ticket](https://github.com/amanj31/Aman-T3-indiv/issues/3)

Runtime: (found on Repl) [Here](https://replit.com/@AmanJain25/Aman-T3-indiv#Main.java)

## Description of the Sort Algorithms

* Selection Sort: selection sort works by finding the smallest element and placing it at the front, and then finding the second-smallest element and placing it in the second position, and so on. When the algorithm is looking for the k-th smallest element (meaning the first k-1 elements are sorted) and it finds it in spot m, the kth and mth elements are swapped.
* Insertion Sort: insertion sort works by sorting the first 2 elements, then the first 3, then the first 4, and so on. Basically, after the first k elements have been sorted, the algorithm looks at the (k + 1)th element and decides where it should go in the sorted list of the first k elements. When this happens and element (k + 1) is moved to position j, all elements after position j are shifted up by one position.
* Bubble Sort: Bubble sort works by going through the whole array multiple (at most the size of the array) times, and each time it swaps two adjacent elements if they are in the wrong order. After the first round the last element must be in the right place, and after the second round the last two must be in the right place, and so on. The algorithm can end early if there is an entire round with no swaps, which means the array is already sorted.
* Merge Sort: Merge sort is a recursively defined algorithm. In it, an array is divided in half, and this algorithm is used to sort both halved. Then, a merge method is used to combine both sorted arrays into a final array. This merging is like peeking (only requires the first element of both sub-arrays). 


## Analysis of Sorting Algorithms

One test case of 12 lists of 5000 integers gave these statistics about the sorting algorithms: (from VSCode, NOT Repl)

Average Selection Sort Time, in nanoseconds (without outliers): 52396600   
Average Insertion Sort Time, in nanoseconds (without outliers): 90672300      
Average Bubble Sort Time, in nanoseconds (without outliers):    264036300     
Average Merge Sort Time, in nanoseconds (without outliers):     12246100     


Average Selection Sort Comparisons and Swaps:      12497500 and 4999      
Average Insertion Sort Comparisons and Insertions: 6267412 and 4999      
Average Bubble Sort Comparisons and Swaps:         12495282 and 6267412      
Average Merge Sort Comparisons and Divisions:      61808 and 9999

### Time complexities:

* Selection Sort: a selection sort algorithm iterates through the last k terms of the array, as k ranges from 1 to n-1 (size of array minus 1). This means the algorithm will always perform 1 + 2 + ... + (n-2) + (n-1) = n(n-1)/2 comparisons. This is an O(n^2) algorithm.
* Insertion Sort: similar to selection sort, an insertion sort algorithm iterates through the first k terms of the array, as k ranges from 2 to n. This means that in a worst-case scenario, the number of comparisons is again quadratic in n, so this is an O(n^2) algorithm.
* Bubble Sort: In a worst case scenario, the algorithm makes n-1 rounds of swaps, and these rounds have n-1, n-2, ..., 2, and 1 swaps. This means there are up to (n-1) + (n-2) + ... + 1 = n(n-1)/2 comparisons, so this is also an O(n^2) algorithm.
* Merge Sort: The algorithm on a data structure of size n is performed by dividing the structure into two structures of size n/2, and then performs an additional algorithm which merges both ordered structures. Overall, the amount of divisions which are performed is log(n), and the merging of the ordered lists is linear in n. Therefore, the combined algorithm in total is O(n log(n)).

### Ranking

* Overall, Merge Sort is by far the best algorithm, except for quite small sets of data. O(n log(n)) is much faster than O(n^2), so the other three algorithms are nowhere near as fast when n grows large. This can also be seen in the times for 5000 elements.
* Insertion and Selection are rather evenly matched. Both perform similar numbers of comparisons and swaps, and they have similar speeds. This can also be seen in the times for 5000 elements. On VSCode Selection Sort performs better, but on Repl Insertion sort is faster
* Bubble sort is the slowest, even though it is also O(n^2). This is because the bubble sort algorithm doesn't optimize the number of swaps it makes (unlike Selection and Insertion), so it can end up swapping elements a lot more than O(n) times. This makes it the slowest by a good amount.
* In terms of storage, the downside of Merge Sort is that it will take up more memory to store the lists formed while dividing and re-merging. On the other hand, the only extra memory needed for the other three sorts is one or two extra variables used in swapping elements.


Code links:
[Selection Sort](https://github.com/amanj31/Aman-T3-indiv/blob/main/SelectionSort.java):
```
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


    
```
[Insertion Sort](https://github.com/amanj31/Aman-T3-indiv/blob/main/InsertionSort.java):
```
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
    
```
[Bubble Sort](https://github.com/amanj31/Aman-T3-indiv/blob/main/BubbleSort.java):
```
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
            boolean isSwap = false;
            for (int j = 0; j < size - 1 - i; j++) {
                comparisons += 1;
                if (data.get(j) > data.get(j + 1)) {
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

    
```
[Merge Sort](https://github.com/amanj31/Aman-T3-indiv/blob/main/MergeSort.java):
```
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


    
```

[Sorts Controller](https://github.com/amanj31/Aman-T3-indiv/blob/main/Sorts.java):
```
import java.util.*;

public class Sorts extends Skeleton {

    public Sorts(String text) {
        super(text);
    }

    @Override
    public void run() {
        SelectionSort[] selectionSorts =  new SelectionSort[12];
        InsertionSort[] insertionSorts = new InsertionSort[12];
        BubbleSort[] bubbleSorts = new BubbleSort[12];
        MergeSort[] mergeSorts = new MergeSort[12];
        ArrayList<Integer> selectionSortTimes = new ArrayList<>();
        ArrayList<Integer> insertionSortTimes = new ArrayList<>();
        ArrayList<Long> bubbleSortTimes = new ArrayList<>();
        ArrayList<Integer> mergeSortTimes = new ArrayList<>();
        ArrayList<Integer> selectionSortComparisons = new ArrayList<>();
        ArrayList<Integer> insertionSortComparisons = new ArrayList<>();
        ArrayList<Integer> bubbleSortComparisons = new ArrayList<>();
        ArrayList<Integer> selectionSortSwaps = new ArrayList<>();
        ArrayList<Integer> insertionSortSwaps = new ArrayList<>();
        ArrayList<Integer> bubbleSortSwaps = new ArrayList<>();
        
        ArrayList<ArrayList<Integer>> casesSelection = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> casesInsertion = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> casesBubble = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> casesMerge = new ArrayList<ArrayList<Integer>>();
        for (int b = 0; b < 12; b++) {
            ArrayList<Integer> h = new ArrayList<>();
            ArrayList<Integer> hh = new ArrayList<>();
            ArrayList<Integer> hhh = new ArrayList<>();
            ArrayList<Integer> hhhh = new ArrayList<>();
            for (int e = 0; e < 5000; e++) {
                h.add((int) (Math.random() * 50000));
            }
            for (int f = 0; f < h.size(); f++) {
                hhhh.add(h.get(f));
                hh.add(h.get(f));
                hhh.add(h.get(f));
            }
            casesSelection.add(h);
            casesInsertion.add(hh);
            casesBubble.add(hhh);
            casesMerge.add(hhhh);
        }
        for (int a = 0; a < 12; a++) {
            selectionSorts[a] = new SelectionSort(casesSelection.get(a));
            insertionSorts[a] = new InsertionSort(casesInsertion.get(a));
            bubbleSorts[a] = new BubbleSort(casesBubble.get(a));
            mergeSorts[a] = new MergeSort(casesMerge.get(a));
            // System.out.println("g " + selectionSorts[a].getData());
            selectionSorts[a].sort();
            insertionSorts[a].sort();
            bubbleSorts[a].sort();
            mergeSorts[a].mort();
            // System.out.println("s " + selectionSorts[a].getData());
            // System.out.println("i " + insertionSorts[a].getData());
            // System.out.println("b " + bubbleSorts[a].getData());
            // System.out.println("m " + mergeSorts[a].getData());
            selectionSortTimes.add(selectionSorts[a].getTimeElapsed());
            insertionSortTimes.add(insertionSorts[a].getTimeElapsed());
            bubbleSortTimes.add(bubbleSorts[a].getTimeElapsed());
            mergeSortTimes.add(mergeSorts[a].getTimeElapsed());
            selectionSortSwaps.add(selectionSorts[a].getSwaps());
            insertionSortSwaps.add(insertionSorts[a].getSwaps());
            bubbleSortSwaps.add(bubbleSorts[a].getSwaps());
            selectionSortComparisons.add(selectionSorts[a].getComparisons());
            insertionSortComparisons.add(insertionSorts[a].getComparisons());
            bubbleSortComparisons.add(bubbleSorts[a].getComparisons());
        }
        selectionSortTimes.sort(null);
        insertionSortTimes.sort(null);
        bubbleSortTimes.sort(null);
        mergeSortTimes.sort(null);
        selectionSortComparisons.sort(null);
        insertionSortComparisons.sort(null);
        bubbleSortComparisons.sort(null);
        selectionSortSwaps.sort(null);
        insertionSortSwaps.sort(null);
        bubbleSortSwaps.sort(null);
        System.out.println();
        System.out.println("selection sort times: " + selectionSortTimes.toString());
        System.out.println("inertion sort times: " + insertionSortTimes.toString());
        System.out.println("bubble sort times: " + bubbleSortTimes.toString());
        System.out.println("merge sort times: " + mergeSortTimes.toString());
        System.out.println();
        int avgSelectionSortTime = 0;
        int avgInsertionSortTime = 0;
        long avgBubbleSortTime = 0;
        int avgSelectionSortComparisons = 0;
        int avgInsertionSortComparisons = 0;
        int avgBubbleSortComparisons = 0;
        int avgSelectionSortSwaps = 0;
        int avgInsertionSortSwaps = 0;
        int avgBubbleSortSwaps = 0;
        int avgMergeSortTime = 0;
        for (int k = 1; k < 11; k++) {
            avgSelectionSortTime += selectionSortTimes.get(k);
            avgInsertionSortTime += insertionSortTimes.get(k);
            avgBubbleSortTime += bubbleSortTimes.get(k);
            avgSelectionSortComparisons += selectionSortComparisons.get(k);
            avgInsertionSortComparisons += insertionSortComparisons.get(k);
            avgBubbleSortComparisons += bubbleSortComparisons.get(k);
            avgSelectionSortSwaps += selectionSortSwaps.get(k);
            avgInsertionSortSwaps += insertionSortSwaps.get(k);
            avgBubbleSortSwaps += bubbleSortSwaps.get(k);
            avgMergeSortTime += mergeSortTimes.get(k);
        }
        System.out.println("Average Selection Sort Time, in nanoseconds (without outliers): " + avgSelectionSortTime / 10);
        System.out.println("Average Insertion Sort Time, in nanoseconds (without outliers): " + avgInsertionSortTime / 10);
        System.out.println("Average Bubble Sort Time, in nanoseconds (without outliers):    " + avgBubbleSortTime / 10);
        System.out.println("Average Merge Sort Time, in nanoseconds (without outliers):     " + avgMergeSortTime / 10);
        System.out.println();
        System.out.println("Average Selection Sort Comparisons and Swaps:      " + avgSelectionSortComparisons / 10 + " and " + avgSelectionSortSwaps / 10);
        System.out.println("Average Insertion Sort Comparisons and Insertions: " + avgInsertionSortComparisons / 10 + " and " + avgInsertionSortSwaps / 10);
        System.out.println("Average Bubble Sort Comparisons and Swaps:         " + avgBubbleSortComparisons / 10 + " and " + avgBubbleSortSwaps / 10);
        

     }
    
}
```
