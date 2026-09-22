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
        scanner.close();
    }

        public static boolean isPalindrome(String str) {
            str = str.replaceAll("\\s", ""); // Remove spaces
            str = str.toLowerCase(); // Convert to lowercase
    
            int left = 0;
            int right = str.length() - 1;
    
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
    
            return true;
    }
}
