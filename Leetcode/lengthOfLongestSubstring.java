class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charCount = new int[256];
        int maxLength = 0, start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            charCount[currentChar]++;

            // If a character repeats, shrink the window
            while (charCount[currentChar] > 1) {
                charCount[s.charAt(start)]--;
                start++;
            }

            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
