import java.util.Scanner;


public class CalculatorController extends Skeleton {
    String prevAns = "";

    public CalculatorController(String text) {
        super(text);
    }

    @Override
    public void run() {
        System.out.println("Enter an expression to calculate: ");
        Scanner scanner = new Scanner(System.in);
        String thisThing = scanner.nextLine();
        try {
            Calculator test1 = new Calculator(((thisThing.replaceAll("ANS", prevAns)).replaceAll("e", "2.718281828459")).replaceAll("pi", "3.14159265359"));
            // test1.setANS(prevAns);
            System.out.println(test1.toString());
            prevAns = test1.getAns();
        } catch (Exception e) {
            System.out.println("Invalid input, try again");
            run();
        }
    }
    
    
}
