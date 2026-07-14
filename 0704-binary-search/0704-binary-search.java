class Solution {// binary search for a sorted array 
    public int search(int[] nums, int target) {int n = nums.length;
        int left = 0 ; int right = n-1 ;int mid =0 ; 
        while ( left <= right ){// need to check until left > right there is chance of element to be presented in the sorted array 
            mid = left+(right-left)/2;// to avoid overflow 
            if (nums[mid] == target)
    return mid;

else if (nums[mid] < target)
    left = mid + 1;// less than req discard left side elements and here we are doing mid +1 because we already go through mid right no need to recheck of it 

else
    right = mid - 1;// if high than req then discard right side part also do one less of mid as we already checked the mid so mid-1 
        }
        return -1;
    }
}