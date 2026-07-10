class Solution {//If your input array is nums = [4, 1, 2, 1, 2]:
//Initial state: result = 0Step 1: 0 ^ 4  -> 4
//Step 2: 4 ^ 1 \(\rightarrow \) 4 ^ 1
//Step 3: 4 ^ 1 ^ 2 -> 4 ^ 1 ^ 2
//Step 4: 4 ^ 1 ^ 2 ^ 1 ->(The 1s cancel out ) 4 ^ 2
//Step 5: 4 ^ 2 ^ 2  -> (The 2s cancel out)  4
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) {// direct xor option applicablers here 
            result ^= n; // XOR operation
        }
        return result;
    }
}