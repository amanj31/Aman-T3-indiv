public class CalculatorController extends Skeleton {

    public CalculatorController(String text) {
        super(text);
    }

    @Override
    public void run() {
        Calculator test1 = new Calculator("2 + 3 * 5");
        System.out.println(test1.toString());
        Calculator test2 = new Calculator("500 / 60 + 30 - 24 * 2");
        System.out.println(test2.toString());
        Calculator test3 = new Calculator("(25 - 4) % 6 + 7 * (9 - 3)");
        System.out.println(test3.toString());
    }
    
    
}
