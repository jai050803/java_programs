import java.util.Scanner;

public class messsage {
    public static void main(String[] args) {
        String message;
        Scanner scan = new Scanner(System.in);
        System.out.println( "Enter a sentence on the line below." );
        message = scan.next();
        System.out.println( message );
        scan.close();
    }
}
