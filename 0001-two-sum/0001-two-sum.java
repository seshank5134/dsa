class Solution {// brute and oiptimal
    public int[] twoSum(int[] nums, int target) {
      /*  for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                return new int[] {i, j};
            }
        }
    }
    throw new IllegalArgumentException("No two sum solution");*/

        // ikada element vundha ledha easy ga check cheyataniki hash map ( have u seen before )


    Map<Integer, Integer> map = new HashMap<>();  // already vunna elements check cheyataniki easy ga hash map use avuthundhi 
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i]; // complement chesthe easy ga next sum kanukotaniki 
        if (map.containsKey(complement)) {
            return new int[] {map.get(complement), i};
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
    }
}