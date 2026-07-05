class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0;
         int c = 0;
         for ( int i : nums ){
            if ( i==1) c++;
            else c=0;
            if ( c>max) max = c;
    
         }
         return max;
    }
}// direct if by check 0