import java.util.HashMap;

class Solution {
    public int maxNumberOfBalloons(String text) {

        // Store frequency of characters present in text
        HashMap<Character, Integer> have = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }

        // Store frequency of characters required for "balloon"
        HashMap<Character, Integer> need = new HashMap<>();

        String s = "balloon";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        // Initially take a very large value
        int result = Integer.MAX_VALUE;

        // Check every required character
        for (char ch : need.keySet()) {

            // How many times this character is required
            int fneed = need.get(ch);

            // How many times this character is available
            int fhave = have.getOrDefault(ch, 0);

            // How many "balloon" can be made using this character
            int time = fhave / fneed;

            // Minimum frequency decides the final answer
            result = Math.min(result, time);
        }

        return result;
    }
}