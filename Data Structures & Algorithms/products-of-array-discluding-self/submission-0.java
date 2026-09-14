class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        int value = 1;

        // Prefix product
        for (int i = 0; i < nums.length; i++) {
            output[i] = value;
            value *= nums[i];
        }

        // Postfix product
        value = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= value;
            value *= nums[i];
        }
        return output;
    }
}  
