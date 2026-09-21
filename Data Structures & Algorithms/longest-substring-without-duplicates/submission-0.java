class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left,right;
        int maxlength=0;
        left=0;
        for(right=0;right<s.length();right++){
            Character currentChar= s.charAt(right);
            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(currentChar);
            maxlength=Math.max(maxlength,right-left+1);

        }
        return maxlength;
    }
}
