import java.util.HashSet;

public class missingNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int n = nums.length;

        HashSet<Integer> numbers = new HashSet<>();
        for (int number : nums) {
            numbers.add(number);
        }

        System.out.print("Missing numbers: ");
        for (int number = 1; number <= n; number++) {
            if (!numbers.contains(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}