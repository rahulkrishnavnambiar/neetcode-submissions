class Solution {
    public int maxArea(int[] heights) {
        int maxarea=0,area;
        int left,right;
        left = 0;
        right= heights.length-1;
        while(left<right){
            area = Math.min(heights[left],heights[right])*(right-left);
            if(area>maxarea){
                maxarea=area;
            }
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxarea;
    }
}
