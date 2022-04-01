import java.util.*;

public class Sorts {
    public static void main(String[] args) {
        SelectionSort[] selectionSorts =  new SelectionSort[12];
        InsertionSort[] insertionSorts = new InsertionSort[12];
        BubbleSort[] bubbleSorts = new BubbleSort[12];
        MergeSort[] mergeSorts = new MergeSort[12];
        ArrayList<Integer> selectionSortTimes = new ArrayList<>();
        ArrayList<Integer> insertionSortTimes = new ArrayList<>();
        ArrayList<Integer> bubbleSortTimes = new ArrayList<>();
        ArrayList<Integer> mergeSortTimes = new ArrayList<>();
        
        ArrayList<ArrayList<Integer>> cases = new ArrayList<ArrayList<Integer>>();
        for (int b = 0; b < 12; b++) {
            ArrayList<Integer> h = new ArrayList<>();
            for (int e = 0; e < 5000; e++) {
                h.add((int) (Math.random() * 50000));
            }
            cases.add(h);
        }
        for (int a = 0; a < 12; a++) {
            selectionSorts[a] = new SelectionSort(cases.get(a));
            insertionSorts[a] = new InsertionSort(cases.get(a));
            bubbleSorts[a] = new BubbleSort(cases.get(a));
            mergeSorts[a] = new MergeSort(cases.get(a));
            selectionSorts[a].sort();
            insertionSorts[a].sort();
            bubbleSorts[a].sort();
            mergeSorts[a].sort();
            // System.out.print(selectionSorts[a].getData());
            // System.out.println();
            // System.out.println();
            // System.out.println();
            // System.out.println();
            // System.out.println();
            // System.out.println();
            //System.out.println(mergeSorts[a].getData());
            selectionSortTimes.add(selectionSorts[a].getTimeElapsed());
            insertionSortTimes.add(insertionSorts[a].getTimeElapsed());
            bubbleSortTimes.add(bubbleSorts[a].getTimeElapsed());
            mergeSortTimes.add(mergeSorts[a].getTimeElapsed());
        }
        selectionSortTimes.sort(null);
        insertionSortTimes.sort(null);
        bubbleSortTimes.sort(null);
        mergeSortTimes.sort(null);
        System.out.println();
        System.out.println("selection sort times: " + selectionSortTimes.toString());
        System.out.println("inertion sort times: " + insertionSortTimes.toString());
        System.out.println("bubble sort times: " + bubbleSortTimes.toString());
        System.out.println("merge sort times: " + mergeSortTimes.toString());
        System.out.println();
        int avgSelectionSortTime = 0;
        int avgInsertionSortTime = 0;
        int avgBubbleSortTime = 0;
        int avgMergeSortTime = 0;
        for (int k = 1; k < 11; k++) {
            avgSelectionSortTime += selectionSortTimes.get(k);
            avgInsertionSortTime += insertionSortTimes.get(k);
            avgBubbleSortTime += bubbleSortTimes.get(k);
            avgMergeSortTime += mergeSortTimes.get(k);
        }
        System.out.println("Average Selection Sort Time, in nanoseconds (without outliers): " + avgSelectionSortTime / 10);
        System.out.println("Average Insertion Sort Time, in nanoseconds (without outliers): " + avgInsertionSortTime / 10);
        System.out.println("Average Bubble Sort Time, in nanoseconds (without outliers):    " + avgBubbleSortTime / 10);
        System.out.println("Average Merge Sort Time, in nanoseconds (without outliers):     " + avgMergeSortTime / 10);
        

    }
    
}
