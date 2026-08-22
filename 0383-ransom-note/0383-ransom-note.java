import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        // Count characters required by ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {

            char ch = ransomNote.charAt(i);

            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        // Count characters available in magazine
        for (int i = 0; i < magazine.length(); i++) {

            char ch = magazine.charAt(i);

            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }

        // Check whether magazine has enough characters
        for (char ch : need.keySet()) {

            int required = need.get(ch);
            int available = have.getOrDefault(ch, 0);

            if (available < required) {
                return false;
            }
        }

        return true;
    }
}