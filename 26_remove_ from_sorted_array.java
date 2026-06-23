class Main{
    public static void main(String [] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = RD(nums);
        System.out.println(k);

    }
    public static int RD(int[] nums){
        int i = 0;
        for (int j = 1; j < nums.length; j++){
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}