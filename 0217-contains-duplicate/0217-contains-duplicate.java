class Solution {
    public boolean containsDuplicate(int[] nums) {
      /* intial idea brute answer complexity O(n^2)
        for (int i = 0; i < nums.length; i++) {

        for (int j = i + 1; j < nums.length; j++) {

            if (nums[i] == nums[j]) {
                return true;
            }
        }
    }

    return false;*/
    /*second optimization  O( n )
    
    Set<Integer> set = new HashSet<> () ;
        for( int num: nums ){
            if ( set.contains(num)) {
                return true ;
            }
            else {
                set.add(num) ;
            }
        }
        return false ;*/
        // smart add into set 
 Set<Integer> set = new HashSet<>();
    for (int num : nums) {
        if (!set.add(num)) {
            return true;
        }
    }

    return false;
    }
}