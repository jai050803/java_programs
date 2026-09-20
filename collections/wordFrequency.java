import java.util.HashMap;
import java.util.Map;

public class wordFrequency {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "cherry", "banana", "apple"};
        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        String highestFrequencyWord = "";
        int highestFrequency = 0;

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

            if (entry.getValue() > highestFrequency) {
                highestFrequencyWord = entry.getKey();
                highestFrequency = entry.getValue();
            }
        }

        System.out.println("Word with highest frequency: " + highestFrequencyWord);
    }
}