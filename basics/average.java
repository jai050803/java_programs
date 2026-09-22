import java.util.Scanner;

public class average{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Input marks for each subject
        System.out.println("Enter the marks for each subject separated by spaces:");
        int[] marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            marks[i] = scanner.nextInt();
        }

        // Calculate average
        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = sum / numSubjects;

        // Display the average
        System.out.println("The average marks is: " + average);

        // Close the scanner
        scanner.close();
    }
}
