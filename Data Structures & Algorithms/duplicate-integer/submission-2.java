class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet val = new HashSet();
        for(int i=0; i<nums.length; i++){
            if (!val.add(nums[i])){
                return true;
            }
        }    
        return false;    
    }
}