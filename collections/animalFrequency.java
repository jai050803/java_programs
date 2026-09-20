import java.util.HashMap;
import java.util.Map;

public class animalFrequency {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "dog", "bird", "cat", "dog", "fish"};
        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        String maxWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey() + " appears 1 time");
            }

            if (entry.getValue() > maxCount) {
                maxWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("max word : " + maxWord + " max count: " + maxCount);
    }
}