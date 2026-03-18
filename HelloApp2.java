

public class HelloApp2 {

    public static void main(String[] args) {

        String message;

        // Check if arguments are provided
        if (args.length > 0) {
            // Join all names with comma and space
            String names = String.join(", ", args);
            message = "Hello, " + names + "!";
        } else {
            // Default message
            message = "Hello, World!";
        }

        // Print final message
        System.out.println(message);
    }
}
