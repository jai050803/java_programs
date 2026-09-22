import java.util.Scanner;

public class input_split {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name and age separated by space ");
        String input = scanner.nextLine();
        Scanner inputScanner = new Scanner(input);
        inputScanner.useDelimiter("[,\\s]+");
        String name = inputScanner.next();
        int age = inputScanner.nextInt();
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        scanner.close();
        inputScanner.close();
    }
}
