import java.util.Scanner;

public class even_number_reverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter numbers separate by space");
        String input = scan.nextLine();
        String[] numStrings = input.split("\\s+");

        int[] num = new int[numStrings.length];

        System.out.println(num);

        scan.close();
    }
}
