 class Main{
    public static void main(String [] args ) {
        int[] nums = {0,1};
        System.out.println(findMissingNumber(nums));
    }
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}