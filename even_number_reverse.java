import java.util.Arrays;
import java.util.Scanner;


public class even_number_reverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter numbers separate by space");
        String input = scan.nextLine();
        String[] numStrings = input.split("\\s+");

        int[] num = new int[numStrings.length];

        int[] ls = null;

        for (int n : num){
            if (n % 2 == 0){
                ls= new int[n];
            }
        }

        System.out.println(Arrays.toString(ls));

        scan.close();
    }
}
