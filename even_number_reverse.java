import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class even_number_reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter numbers separated by space
        System.out.print("Enter numbers separated by space: ");
        String input = scanner.nextLine();

        // Split the input string into an array of strings using spaces as the delimiter
        String[] numberStrings = input.split("\\s+");

        // Create a list to store even numbers
        List<Integer> evenNumbersList = new ArrayList<>();

        scanner.close();

        // Convert and add even numbers to the list
        for (String str : numberStrings) {
            try {
                int num = Integer.parseInt(str);
                if (num % 2 == 0) {
                    evenNumbersList.add(num);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid integers separated by spaces.");
                return;
            }
        }

        // Check if any even numbers were found
        if (evenNumbersList.isEmpty()) {
            System.out.println("No even numbers found in the input.");
        } else {
            // Sort the list in ascending order
            Collections.sort(evenNumbersList);

            // Print the sorted list
            System.out.println("Even numbers in ascending order: " + evenNumbersList);
        }
        
    }
}
