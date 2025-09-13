class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        String vowels = "aeiou";
        int maxVowel = 0;
        int maxConsonant = 0;
        for (int i = 0; i < 26; i++) {
            char currentChar = (char) (i + 'a');
            if (vowels.indexOf(currentChar) != -1) {
                if (freq[i] > maxVowel) {
                    maxVowel = freq[i];
                }
            } else {
                if (freq[i] > maxConsonant) {
                    maxConsonant = freq[i];
                }
            }
        }
        return maxVowel + maxConsonant;
    }
}
