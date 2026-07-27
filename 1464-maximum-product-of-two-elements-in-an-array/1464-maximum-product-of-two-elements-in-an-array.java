class Solution {
    public int maxProduct(int[] nums) {
        // int max1 = 0; int max2 =0;
        // for(int n : nums){
        //     max2 = Math.max(max2, Math.min(max1,n));
        //     max1= Math.max(max1,n);
        // }
        // return (max1-1)*(max2-1);
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for (int n : nums) {
            if (n > max1) {
                max2 = max1; // Old max1 becomes the second largest
                max1 = n;    // New largest found
            } else if (n > max2) {
                max2 = n;    // n is between max1 and max2
            }
        }
        return (max1-1)*(max2-1);
    }
}