class Main{
    public static void main(String[] args){
        int nums[]= {1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double max=0;
        for (int i = 0; i < k; i++) {
            max+=nums[i];
        }
        double sum=max;
        for (int i = k; i < nums.length; i++) {
            sum+=nums[i]-nums[i-k];
            max=Math.max(max,sum);
        }
        return max/k;
    }


    // public static double findMaxAverage(int[] nums, int k) {

    //     double maxSum = Integer.MIN_VALUE;

    //     for (int i = 0; i <= nums.length - k; i++) {

    //         double currentSum = 0;

    //         for (int j = i; j < i + k; j++) {
    //             currentSum += nums[j];
    //         }

    //         maxSum = Math.max(maxSum, currentSum);
    //     }

    //     return maxSum / k;
    // }
}