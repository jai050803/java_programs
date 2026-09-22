import java.util.Scanner;


public class even_odd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int n = scan.nextInt();
        if (n % 2 != 0){
            System.out.println("Weird");
        } else if (n % 2 == 0 & n >= 2 & n <= 5){
            System.out.println("Not Weird");
        } else if (n%2 == 0 & n >= 6 & n <= 20){
            System.out.println("Weird");
        } else{
            System.out.println("Not Weird");
        }

        scan.close();
    }
}
