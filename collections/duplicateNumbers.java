import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class duplicateNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2, 3, 5, 1, 6};

        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int number : nums) {
            frequency.put(number, frequency.getOrDefault(number, 0) + 1);
        }

        ArrayList<Integer> duplicates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        LinkedHashSet<Integer> seen = new LinkedHashSet<>();
        for (int number : nums) {
            seen.add(number);
        }
        Integer[] uniqueNumbers = seen.toArray(new Integer[0]);

        System.out.println("Duplicate numbers: " + duplicates);
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueNumbers));
    }
}