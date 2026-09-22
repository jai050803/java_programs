import java.util.LinkedHashSet;

public class missingNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int n = nums.length;
        
        LinkedHashSet<Integer> seen = new LinkedHashSet<>();
        for(int number : nums){
            seen.add(number);
        }
        System.out.println("missing numbers : ");
        for(int i = 1; i <= n; i++){
            if(!seen.contains(i)) System.out.println(i);
        }

        System.out.println();
    }
}