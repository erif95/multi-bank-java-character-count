import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCounter {

    public static String countCharacters(String input) {
        // Edge case: null or empty string
        if (input == null || input.isEmpty()) {
            return "";
        }

        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count each character (including spaces and all whitespaces)
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Build output string
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (index > 0) {
                result.append(", ");
            }
            // Represent whitespaces clearly
            String keyDisplay = entry.getKey() == ' ' ? "' '" : entry.getKey().toString();
            result.append(keyDisplay).append(":").append(entry.getValue());
            index++;
        }

        return result.toString();
    }

    /**
     * Main method with test cases
     */
    public static void main(String[] args) {
        String[] testCases = {
                "hello world",        // lowercase letters + space
                "programming",        // repeated letters
                "aaa",                // same letters
                "abcdef",             // unique letters
                "",                   // empty string
                "Hello World",        // uppercase + lowercase + space
                "12321",              // numbers
                "a b c a b c",        // letters with spaces
                "HhH h",              // uppercase vs lowercase + spaces
                "  ",                // only spaces
                "\t\n",               // tabs and newlines
                null                  // null input
        };

        System.out.println("Character Occurrence Counter\n");

        for (String test : testCases) {
            String result = countCharacters(test);
            System.out.println("Input:  \"" + test + "\"");
            System.out.println("Output: " + result);
            System.out.println();
        }
    }
}
