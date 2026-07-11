class Solution {// need to find the duplicate ( repeated term in the given array of numbers )
    public int findDuplicate(int[] nums) {
         Set<Integer> seen = new HashSet<>();// seen or not check easy by set ( unique values)
        for (int num : nums) {
            if (seen.contains(num)) {// o(1) for set.contains()
                return num; // Return the first duplicate found
            }
            seen.add(num);
        }
        return -1;
    }
}