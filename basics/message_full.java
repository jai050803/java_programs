import java.util.Scanner;

public class message_full {
    public static void main(String[] args) {
        String message;
        Scanner scan = new Scanner(System.in);
        System.out.println( "Enter a sentence on the line below." );
        message = scan.nextLine();
        System.out.println( message );
        scan.close();
    }
}
