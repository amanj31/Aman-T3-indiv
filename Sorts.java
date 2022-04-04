import java.util.*;

public class Sorts {
    public static void main(String[] args) {
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
