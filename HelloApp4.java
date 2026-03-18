
public class HelloApp4 {

    public static void main(String[] args) {

        // If no arguments → default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            StringBuilder sb = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                sb.append(name).append(", ");
            }

            // Remove last ", "
            sb.setLength(sb.length() - 2);

            // Print final greeting
            System.out.println("Hello, " + sb.toString() + "!");
        }
    }
}