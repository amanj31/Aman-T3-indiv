import java.util.Scanner;
import java.util.ArrayList;


public class CalculatorController extends Skeleton {
    String prevAns = "";
    String varX = "";
    String varY = "";
    //ArrayList<String> vars = new ArrayList<>();

    public CalculatorController(String text) {
        super(text);
    }

    @Override
    public void run() {
        System.out.println("Hardcoded Example:");
        System.out.println("Original expression: 200 % (300 + 5 + 300) / 200 + 1 * 100");
        System.out.println("Tokenized expression: [200, %, (, 300, +, 5, +, 300, ), /, 200, +, 1, *, 100]"); 
        System.out.println("Reverse Polish Notation: [200, 300, 5, +, 300, +, %, 200, /, 1, 100, *, +]");
        System.out.println("Final result: 101.00");
        System.out.println();
        System.out.println("Enter an expression to calculate OR type 'SETVAR' to set variables X and Y: ");
        System.out.println("Use 'ANS' to access the previous answer. Use 'pi' and 'e' to access these mathematical constants. Use 'SQRT()' to take a square root.");
        Scanner scanner = new Scanner(System.in);
        String thisThing = scanner.nextLine();
        try {
            if (thisThing.equals("SETVAR")) {
                // System.out.println("Print 'EXIT' to stop adding variables.");
                // while (scanner.nextLine().equals("EXIT") == false) {
                //     System.out.println("Set variable X" + vars.size() + ": ");
                //     vars.add(scanner.nextLine())
                // }
                System.out.println("X = ?");
                varX = scanner.nextLine();
                System.out.println("Y = ?");
                varY = scanner.nextLine();
            } else {
                Calculator test1 = new Calculator(((((thisThing.replaceAll("ANS", prevAns)).replaceAll("e", "2.718281828459")).replaceAll("pi", "3.14159265359")).replaceAll("X", varX)).replaceAll("Y", varY));
                // test1.setANS(prevAns);
                System.out.println(test1.toString());
                prevAns = test1.getAns();
            }     
        } catch (Exception e) {
            System.out.println("Invalid input, try again");
            run();
        }
    }
    
    
}
