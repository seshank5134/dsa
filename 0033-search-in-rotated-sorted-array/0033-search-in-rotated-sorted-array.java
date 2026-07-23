class Solution {// typical binary problem with a rotation 
    public int search(int[] nums, int target) {int left = 0 ; int right = nums.length-1;
        while (left <= right) {// same logic for left and right 

    int mid = left + (right - left) / 2;

    if (nums[mid] == target)
        return mid;
        // here to we need to check whether mid is in sort or not so we can identify as everything is sorterd just rotated 

    // Left half is sorted(whether the  mid is in left and left side is sorted )
    if (nums[left] <= nums[mid]) {

        if (nums[left] <= target && target < nums[mid]) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }

    }
    // Right half is sorted( checking whethermid is right andd right as sorted )
    else {

        if (nums[mid] < target && target <= nums[right]) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
}

return -1;
    }
}