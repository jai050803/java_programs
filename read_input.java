import java.util.Scanner;

public class read_input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the integer then float number then a string");
        int a = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        System.out.println("String is: " + s);
        System.out.println("integer is: " + a);
        System.out.println("number is: " + d);
        scan.close();
    }
}
