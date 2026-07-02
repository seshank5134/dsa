class Solution {
    public int[] twoSum(int[] numbers, int target) {
     int le= 0; int  ri= numbers.length-1;
    for ( int i = 0 ; i<numbers.length;i++){
        if (numbers[le]+numbers[ri]==target){
            return new int[]{le+1,ri+1};
        } else if (numbers[le]+numbers[ri]<target){
            le++;
        } else {
            ri--;
        }
    }
    return new int[]{-1, -1};   
    }
}
//I can use two pointers. If the current sum is smaller than the target, I move the left pointer to increase the sum. If the current sum is greater than the target, I move the right pointer to decrease the sum. Because the array is sorted