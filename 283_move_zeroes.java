class Main{
    public static void main (String[] args ) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for (int i = 0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void moveZeroes(int[] nums) {
        int l = 0; int r = 0;
        for (int i = 0; i<nums.length;i++){
            if (nums[i]!=0){
                nums[l] = nums[i];
                l++;
            }
        }
        for (int i = l; i<nums.length;i++){
            nums[i] = 0;
        }
    }
}