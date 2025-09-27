import java.util.*;

class Solution {
    public String majorityFrequencyGroup(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        Map<Integer, List<Character>> groups = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();
            groups.computeIfAbsent(count, k -> new ArrayList<>()).add(entry.getKey());
        }

        int bestSize = -1, bestK = -1;
        List<Character> bestGroup = new ArrayList<>();
        for (Map.Entry<Integer, List<Character>> entry : groups.entrySet()) {
            int k = entry.getKey();
            List<Character> chars = entry.getValue();
            int size = chars.size();
            if (size > bestSize || (size == bestSize && k > bestK)) {
                bestSize = size;
                bestK = k;
                bestGroup = chars;
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : bestGroup) {
            result.append(c);
        }
        return result.toString();
    }
}
