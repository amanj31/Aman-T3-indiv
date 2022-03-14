import java.util.Scanner;

public class IntByReference extends Skeleton {
    public IntByReference(String text) {
        super(text);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter 2 numbers a and b in order to demonstrate swap");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("BEFORE: a is " + a + " and b is " + b);
            if (b < a) {
                System.out.println("AFTER: a is " + b + " and b is " + a);
            } else {
                System.out.println("AFTER: a is " + a + " and b is " + b);
            }     
        } catch (Exception e) {
            System.out.println("Invalid input, try again");
            run();
        }

    }
}
