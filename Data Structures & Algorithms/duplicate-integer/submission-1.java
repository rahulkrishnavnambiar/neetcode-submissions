class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet val = new HashSet();
        for(int i=0; i<nums.length; i++){
            if (val.contains(nums[i])){
                return true;
            }
            val.add(nums[i]);
        }
        return false;
        
    }
}