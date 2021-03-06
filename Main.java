/*
Creator: Nighthawk Coding Society
Mini Lab Name: Hello Series, featuring Monkey Jumpers
Level: Easy
*/

/* 
Imports allow you to use code already written by others.  
Java has manytest standard libraries. The names around the dots in import often give you a hint to the originator of the code.
 */
import java.util.HashMap;
import java.util.Scanner; //java library for user input

/** Main - entry point class for this project
1.'C' and Java have a main function/method that is the ENTRY into code execution. Both languages need a file to contain that ENTRY method/function.  Common convention for 'C': main.c.  Convention for Java: Main.java.
2. Replit requires a "Main.java" file and a main class ("public Class Main").  Inside the class it expects a method named "public static void main(String[] args)"."
3. Conventions and structures are part of a programming language and the tools you use.  Python people like to pick on these Java conventions, saying they are difficult.  What do you think? 
*/
public class Main {   //Everything in Java is inside a class, Squigs, Squigalies, or Curly brackets denote a code block in Java.  This is the beginning of class code block.

    /** main - entry point method for this project
    main is the entry or pri·mor·di·al code block for Java
    */
    static public void main(String[] args)  {  // open squig begins the method
        HashMap<Integer, Skeleton> choices = new HashMap<Integer, Skeleton>();
        choices.put(0, new Exit("Choice 0"));
        choices.put(1, new ZeroTest("Choice 1"));
        choices.put(2, new HelloWorld("Choice 2"));
        choices.put(3, new IntByReference("Choice 3 (Swapper)"));
        choices.put(4, new Matrix("Choice 4 (Matrix)"));
        choices.put(5, new CreatingQueue("Choice 5: Create a Queue"));
        choices.put(6, new MergeSortExample("Choice 6: Sort two Linked Lists"));
        choices.put(7, new QueueToStack("Choice 7: Queue to Stack"));
        choices.put(8, new CalculatorController("Choice 8: Calculator"));
        choices.put(9, new Sorts("Choice 9: Sorts"));
        
         // 'coder' defined method/function call to a different code block

        while (true) {
            menu("\n Here is the menu: ", choices);
        }
    } // close squig ends the method.  What did this method do?

    /**
     * menu - method that is activated by main, this will perform Java code
     */
    public static void menu(String banner, HashMap<Integer, Skeleton> choices) {
        System.out.println(banner);

        for (int i = 0; i < choices.size(); i++) {
            System.out.println(i + ": " + choices.get(i).toString());
        }
        System.out.println("Select an option: ");

        try {
            Scanner currentScan = new Scanner(System.in);
            int order = currentScan.nextInt();
            int qq = 0;
            do {
                choices.get(order).run();
                qq++;
            } while (qq < 1);
            
        } catch (Exception e) {
            System.out.println("Please choose a valid menu item");
        }
    }

}