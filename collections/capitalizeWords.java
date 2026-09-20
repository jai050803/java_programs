public class capitalizeWords {
    public static void main(String[] args) {
        String sentence = "hello world java interview";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(Character.toUpperCase(words[i].charAt(0)))
                    .append(words[i].substring(1));

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println(result);
    }
}