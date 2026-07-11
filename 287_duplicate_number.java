import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int duplicate = findDuplicate(nums);
        System.out.println(duplicate);
    }

    public static int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num; // Return the first duplicate found
            }
            seen.add(num);
        }
        return -1; // Return -1 if no duplicate is found
    }
}