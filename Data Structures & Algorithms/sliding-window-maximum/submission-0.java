class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int right = 0; right < n; right++) {

            // Remove indices outside the current window
            while (!deque.isEmpty() &&
                   deque.peekFirst() < right - k + 1) {
                deque.pollFirst();
            }

            // Remove smaller elements from the back
            while (!deque.isEmpty() &&
                   nums[deque.peekLast()] < nums[right]) {
                deque.pollLast();
            }

            // Add current index
            deque.addLast(right);

            // Window is ready
            if (right >= k - 1) {
                result[right - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
