class Solution {// clasic sliding window problem where able to move upto k times of zero to 1 to make maximum consecutive of ones 
    public int longestOnes(int[] nums, int k) {
        int left = 0;
    int zeroCount = 0;
    int maxLen = 0;

    for (int right = 0; right < nums.length; right++) {

        // Expand window
        if (nums[right] == 0) {
            zeroCount++;
        }

        // Shrink window if invalid
        while (zeroCount > k) {

            if (nums[left] == 0) {
                zeroCount--;
            }

            left++;
        }

        // Update answer
        maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen;
    }
}// sliding window pattern 