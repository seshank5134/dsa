class Solution { // log n of time and o(1) space we donnt taking any space extra 
    public int findMin(int[] nums) {int left=0; int right=nums.length-1;
        while (left < right) {// Every iteration removes part of the search space so finnaly will get single out at last 

    int mid = left + (right - left) / 2;

    if (nums[mid] > nums[right]) {

       left = mid+1; 

    } else {

        right = mid; // because we still dont know that mid may be minimum so we have to recheck with the part and other to be discarded

    }

}

return nums[left];
    }
}