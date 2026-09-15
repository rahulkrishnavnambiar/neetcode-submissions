class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> values=new HashSet<>();
        for(int num:nums){
            values.add(num);
        }
        int maxLength=0,curLength=0;
        for(int num:nums){
            if(!values.contains(num-1)){
                curLength=1;
                while(values.contains(num+1)){
                    curLength++;
                    num++;
                }
                if(maxLength<curLength){
                    maxLength=curLength;
                }
            }
        }
        return maxLength;
    }
}
