import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static Map<String, Integer> countWordFrequency(String sentence) {
        Map<String, Integer> frequency = new HashMap<>();
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            } else {
                frequency.put(word, 1);
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        String sentence = "the cat sat on the mat the cat";
        Map<String, Integer> result = countWordFrequency(sentence);

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}