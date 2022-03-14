import java.util.HashMap;
import java.util.Scanner;

public class Matrix extends Skeleton {
    HashMap<Integer, String> hexadecimal = new HashMap<Integer, String>();
    public Matrix(String text) {
        super(text);
        hexadecimal.put(10, "a");
        hexadecimal.put(11, "b");
        hexadecimal.put(12, "c");
        hexadecimal.put(13, "d");
        hexadecimal.put(14, "e");
        hexadecimal.put(15, "f");
    }

    static int[][] keypad() {
        return new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -1}};
    }

    static int[][] hexNums() {
        return new int[][] {{0, 1}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}};
    }

    private void toAString(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < arr[i].length; j++) {
                if (arr[i][j] < 10 && arr[i][j] > -1) {
                    System.out.print(arr[i][j]);
                } else if (arr[i][j] < 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(hexadecimal.get(arr[i][j]));
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
        for (int i = arr.length - 1; i > -1; i--) {
            for (int j = arr[i].length - 1; i > -1; j--) {
                if (arr[i][j] < 10 && arr[i][j] > -1) {
                    System.out.print(arr[i][j]);
                } else if (arr[i][j] < 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(hexadecimal.get(arr[i][j]));
                }
            }
            System.out.println("");
        }
    }

    public void run() {
        // Scanner scanner = new Scanner(System.in);
        // try {
        //     System.out.println("Enter 0 to demonstrate matrix on a keypad and 1 to demonstrate matrix on hexademical numbers");
        //     int c = scanner.nextInt();
        //     if (c > 1 || c < 0) {
        //         System.out.println("invalid input, try again");
        //     } else if (c == 0) {
        //         int[][] pad = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -1}};
        //         toAString(pad);
        //     } else {
        //         int[][] hexes = new int[][] {{0, 1}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}};
        //         toAString(hexes);
        //     }
        // } catch (Exception e) {
        //     System.out.println("Invalid input, try again");
        //     run();
        // }
        int[][] pad = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -1}};
        toAString(pad);
        int[][] hexes = new int[][] {{0, 1}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}};
        toAString(hexes);
    }
    
}
