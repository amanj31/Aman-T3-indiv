import java.util.Scanner;


public class CalculatorController extends Skeleton {

    public CalculatorController(String text) {
        super(text);
    }

    @Override
    public void run() {
        System.out.println("Enter an expression to calculate: ");
        Scanner scanner = new Scanner(System.in);
        String thisThing = scanner.nextLine();
        try {
            Calculator test1 = new Calculator(thisThing);
            System.out.println(test1.toString());
        } catch (Exception e) {
            System.out.println("Invalid input, try again");
            run();
        }
    }
    
    
}
