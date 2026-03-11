/**
 * Hello Application
 * Displays Hello with command-line argument or default value
 * 
 * @author Vansh
 * @version 1.0
 */

public class HelloApp3 {

    public static void main(String[] args) {

        String name = (args.length > 0) ? args[0] : "vansh";

        System.out.println("Hello, " + name + "!");

    }

}
