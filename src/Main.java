import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> charFrequencies = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (Character.isLetter(c)) {
                if (!charFrequencies.containsKey(c)) {
                    charFrequencies.put(c, 1);
                } else {
                    charFrequencies.put(c, charFrequencies.get(c) + 1);
                }
            }
        }
        char maxChar = 0;
        int maxFreq = -1;
        char minChar = 0;
        int minFreq = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : charFrequencies.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxChar = entry.getKey();
                maxFreq = entry.getValue();
            }
            if (entry.getValue() < minFreq) {
                minChar = entry.getKey();
                minFreq = entry.getValue();
            }
        }
        System.out.println("Символ, который встречается чаще всего: " + maxChar + ", частота: " + maxFreq);
        System.out.println("Символ, который встречается реже всего: " + minChar + ", частота: " + minFreq);
    }
}