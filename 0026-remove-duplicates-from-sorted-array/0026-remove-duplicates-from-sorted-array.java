class Solution {// basic with for  and if to remove the repeate
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++){
            if (nums[j] != nums[i]){// if not there then will move on t next 
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}// time complex mostly o(n) and space be o(1)