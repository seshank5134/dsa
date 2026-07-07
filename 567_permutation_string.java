import java.util.Arrays;
class Solution{
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "cba";
        boolean result = checkInclusion(s1, s2);
        System.out.println(result);
    }
    // clasic sliding window one  which we ave to check premutations of s1 to be in s2 or not 
    public  static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1Count = new int[26]; // better optimization with array as we dont need frequencies and can remove them with complement 
        int[] s2Count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;// asci caalculation to keep them from index of 0 to 25 as a to z
            s2Count[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(s1Count, s2Count)) { // prior directly check by array method of Arrays.equal if true direcly true 
            return true;
        }
        for (int i = s1.length(); i < s2.length(); i++) {
            s2Count[s2.charAt(i) - 'a']++;
            s2Count[s2.charAt(i - s1.length()) - 'a']--; // window and need sizes should be same not a shrinks or expands ex s1 = "abcd " then s2 = " cdab " or "edgc" like only 4 to be  so we have to use complement logic here 
            if (Arrays.equals(s1Count, s2Count)) {
                return true; // will check each irteration that s2 == s1 
            }
        }
        return false;// finally not happen then false 
    }
}
