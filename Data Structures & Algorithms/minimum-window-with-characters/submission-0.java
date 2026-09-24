class Solution {
    public String minWindow(String s, String t) {
        String output = "";
        int left = 0;
        int have = 0;
        int seen = 0;

        int[] window = new int[128];
        int[] target = new int[128];

        // Build target frequency
        for (char c : t.toCharArray()) {
            target[c]++;

            if (target[c] == 1) {
                have++;
            }
        }

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);
            window[current]++;

            // Character has reached required frequency
            if (window[current] == target[current]) {
                seen++;
            }

            // Window contains everything required
            while (seen == have) {

                // Save current window
                String temp = s.substring(left, right + 1);

                if (output.length() == 0 ||
                    temp.length() < output.length()) {
                    output = temp;
                }

                // Remove left character
                char leftChar = s.charAt(left);
                window[leftChar]--;

                // If removing it makes the window invalid
                if (window[leftChar] < target[leftChar]) {
                    seen--;
                }

                left++;
            }
        }

        return output;
    }
}
