import java.util.Scanner;

public class name_percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.nextLine();
        System.out.println("enter no of subjects");
        int subjects = scanner.nextInt();
        int[] max_marks = new int[subjects];
        for (int i = 0; i < subjects; i++){
            System.out.print("Enter the maximum marks for subject " + (i + 1) + ": ");
            max_marks[i] = scanner.nextInt();
        }

        int[] marksObtained = new int[subjects];
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter the marks obtained in subject " + (i + 1) + ": ");
            marksObtained[i] = scanner.nextInt();
        }

        double totalMarks = 0;
        double percentage;

        for (int i = 0; i < subjects; i++) {
            totalMarks += (double) marksObtained[i] / max_marks[i] * 100;
        }

        percentage = totalMarks/subjects;

        System.out.println("total percentage obtained by student " + name + " is :" + percentage +"%");
        scanner.close();
    }
}
