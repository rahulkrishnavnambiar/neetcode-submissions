class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];
        int windowSize = s1.length();

        for (int i = 0; i < windowSize; i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            windowFreq[s2.charAt(i) - 'a']++;
        }


        // Check first window
        if (Arrays.equals(s1Freq, windowFreq)) {
            return true;
        }

        // Slide the window
        for (int right = windowSize; right < s2.length(); right++) {

            // Add new character
            windowFreq[s2.charAt(right) - 'a']++;

            // Remove character leaving the window
            int left = right - windowSize;
            windowFreq[s2.charAt(left) - 'a']--;

            // Check if frequencies match
            if (Arrays.equals(s1Freq, windowFreq)) {
                return true;
            }
        }

        return false;


        
    }
}
