class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=0;
        for (int i = 0; i < k; i++) { // this window sliding problem 
            max+=nums[i];
        }
        double sum=max;
        for (int i = k; i < nums.length; i++) {
            sum+=nums[i]-nums[i-k];// will remove from left ( shrink)
            max=Math.max(max,sum);
        }
        return max/k;
        
    }
}