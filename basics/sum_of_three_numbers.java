import java.util.Scanner;

public class sum_of_three_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers:");
        String input = scanner.nextLine();
        Scanner inputScanner = new Scanner(input);
        inputScanner.useDelimiter("[,\\s]+");
        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();
        int c = inputScanner.nextInt();
        System.out.println("sum is " + (a+b+c));
        scanner.close();
        inputScanner.close();

    }
    
}
