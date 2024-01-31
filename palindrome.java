import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str1 = scanner.nextLine();
        if (isPalindrome(str1)) {
            System.out.println("'" + str1 + "' is a palindrome.");
        } else {
            System.out.println("'" + str1 + "' is not a palindrome.");
        }
    }
}
