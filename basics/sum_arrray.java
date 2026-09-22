public class sum_arrray {
    public static void main(String[] args) {
        int[] myArray = {1, 5, 10, 25};
        int sum = 0;
        int i; 

        // Loop through the array elements and store the sum in the sum variable
        for (i = 0; i < myArray.length; i++) {
        sum += myArray[i];
        }

        System.out.println("The sum is: " + sum);
    }
}
