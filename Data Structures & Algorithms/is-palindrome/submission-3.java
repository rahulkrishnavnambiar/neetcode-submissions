class Solution {
    public boolean isPalindrome(String s) {
        char[] ch = s.toCharArray();
        int left=0,right=s.length()-1;
        while(left<right){
            while(left <= right &&!Character.isLetterOrDigit(ch[left])){
                left++;
            }
            while(left <= right &&!Character.isLetterOrDigit(ch[right])){
                right--;
            }
            if(left <= right &&Character.toLowerCase(ch[left])!=
            Character.toLowerCase(ch[right])){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
