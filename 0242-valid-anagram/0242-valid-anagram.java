class Solution {// best calculation with asci calculation 
    /*  public boolean isAnagram(String s, String t) {
       // first brute idea by two for loops 
              
    if (s.length() != t.length()) {
        return false;
    }

    char[] arr = t.toCharArray();

    for (int i = 0; i < s.length(); i++) {

        boolean found = false;

        for (int j = 0; j < arr.length; j++) {

            if (s.charAt(i) == arr[j]) {
                found = true;
                arr[j] = '#'; // mark as used
                break;
            }
        }

        if (!found) {
            return false;
        }
    }

    return true;*/ 
    // optimized version done by reference 
    public static boolean isAnagram ( String s, String t ) {
        if (s.length() != t.length()) { // 1st important check  Length Validation
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) { // Single-Pass Character Counting
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) { //The Verification Check
            if (c != 0) {
                return false; 
            }
        }
        return true;
    }}
