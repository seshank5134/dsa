class Solution {// need to find the duplicate ( repeated term in the given array of numbers )
    public int findDuplicate(int[] nums) {// classic binary search 
         Set<Integer> seen = new HashSet<>();// seen or not check easy by set ( unique values)
        for (int num : nums) {// enhanced for loop which complexity b e o(n)
            if (seen.contains(num)) {// o(1) for set.contains()
                return num; // Return the first duplicate found
            }
            seen.add(num);// will ADD THEN NUMBER WHICH IS NOT SEEN AND SET HAVE FEATURES OF STORING ONLY UNIQUE VALUES 
        } // urike
        return -1;
    }
}