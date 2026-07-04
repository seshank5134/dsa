class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) {// direct xor option applicablers here 
            result ^= n; // XOR operation
        }
        return result;
    }
}