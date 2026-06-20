
 class ValidAnagram {

    /* brute force approach
    public static boolean isAnagram(String s, String t) {

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

    return true;
}*/
    public static void main ( String[] args ) {
        String s = "anagram" ;
        String t = "nagaram" ;
        System.out.println ( isAnagram ( s, t ) ) ;
    }
    public static boolean isAnagram ( String s, String t ) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return false; 
            }
        }
        return true;
    }}