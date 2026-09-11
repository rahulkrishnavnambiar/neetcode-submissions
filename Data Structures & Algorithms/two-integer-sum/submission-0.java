class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> valuemap = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            int needed = target - nums[i];
            if(valuemap.containsKey(needed)){
                return new int[]{valuemap.get(needed),i};
            }
            else{
                valuemap.put(nums[i], i);
        }
        }
        return new int[]{};
    }
}
