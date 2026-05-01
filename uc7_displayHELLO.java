import java.util.Scanner;

/**
 * UC7: Display Hello message by taking user input
 * This program demonstrates input handling,
 * variables, and formatted output.
 */
public class uc7_displayHELLO {

    /**
     * Entry point of the program
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display personalized message
        System.out.println("************************");
        System.out.println("Hello, " + name + "!");
        System.out.println("Welcome to UC7 Program");
        System.out.println("************************");

        // Close scanner
        scanner.close();
    }
}