class Solution {// calssic binary wotih first and last 
    public int[] searchRange(int[] nums, int target) {
        int left= 0; int right = nums.length - 1;
            int first = binarySearch(nums, target, true);// here we are calling to get first with find first as true 
            int last = binarySearch(nums, target, false);// here we have to call the method to check the last onbe with false as findFirst 
            return  new int[]{first,last};
        }
        public static int binarySearch(int nums[], int target, boolean findFirst){
            int left = 0; int right = nums.length - 1;
            int result = -1;
            while(left <= right){
                int mid = left + (right - left) / 2;
                if(nums[mid] == target){
                    result = mid;
                    if(findFirst){
                        right = mid - 1;
                    }else{
                        left = mid + 1;
                    }
                }else if(nums[mid] < target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            return result;
        }
}