class Solution {
    public int characterReplacement(String s, int k) {
        int[] frequency = new int[26];

        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            int index = s.charAt(right) - 'A';
            frequency[index]++;

            // Highest frequency character in the window
            maxFrequency = Math.max(maxFrequency, frequency[index]);

            // If replacements needed > k, shrink window
            while ((right - left + 1) - maxFrequency > k) {
                frequency[s.charAt(left) - 'A']--;
                left++;
            }

            // Current valid window length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
