class Solution {
    public void rotate(int[] nums, int k) {
    //     int n = nums.length;
    //     k=k%n;
    //      for (int i = 0; i < k; i++) {
    //         int last = nums[n - 1];
    //         for (int j = n - 1; j > 0; j--) {
    //             nums[j] = nums[j - 1];
    //         }
    //         nums[0] = last;


    // }
     int n = nums.length;
    k = k % n; // Handle cases where k is greater than n
        reverse(nums, 0, n - 1); // Reverse the entire array
        reverse(nums, 0, k - 1); // Reverse the first k elements
        reverse(nums, k, n - 1); // Reverse the remaining elements
    }
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }   
    }
}