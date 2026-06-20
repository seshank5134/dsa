 import java.util.*; 
 class Main {
    public static void main ( String[] args ) {
        int [] nums = {1,2 ,3, 1} ;
        System.out.println ( containsDuplicate ( nums ) ) ;
    }
    public static boolean containsDuplicate ( int[] nums ) {
      Set<Integer> set = new HashSet<> () ;
        for( int num: nums ){
            if ( set.contains(num)) {
                return true ;
            }
            else {
                set.add(num) ;
            }
        }
        return false ;
/* for (int i = 0; i < nums.length; i++) {

        for (int j = i + 1; j < nums.length; j++) {

            if (nums[i] == nums[j]) {
                return true;
            }
        }
    }

    return false;*/
 }}