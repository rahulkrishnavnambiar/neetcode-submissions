class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> val = new HashSet();
        for(int num : nums){
            if (!val.add(num)){
                return true;
            }
        }    
        return false;    
    }
}