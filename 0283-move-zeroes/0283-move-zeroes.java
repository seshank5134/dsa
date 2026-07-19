class Solution {// classic array with loops  
    public void moveZeroes(int[] nums) { // sort zeo to end   by first half upto l 
         int l = 0; int r = 0;
        for (int i = 0; i<nums.length;i++){
            if (nums[i]!=0){
                nums[l] = nums[i];
                l++;
            }
        }
        for (int i = l; i<nums.length;i++){// save zeros from l onwards 
            nums[i] = 0;
        }
    }
}