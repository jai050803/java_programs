import java.util.Scanner;

public class even_number_reverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter numbers separate by space");
        String input = scan.nextLine();
        Scanner inputScanner = new Scanner(input);
        inputScanner.useDelimiter("[,\\s]+");


        scan.close();
        inputScanner.close();
    }
}
