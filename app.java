import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Output a greeting message to the console
        System.out.println("Hello! Welcome to the Java Sample Program.");
        
        // Setting up a Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        
        String userName = scanner.nextLine();
        
        // Conditional logic based on user input
        if (userName.trim().isEmpty()) {
            System.out.println("You didn't enter a name!");
        } else {
            System.out.println("Great to meet you, " + userName + "!");
        }
        
        // Close the scanner resource
        scanner.close();
    }
}

