class Solution {
    public void reverseString(char[] s) {
       int l = 0; int r = s.length-1; //We don't need another array because the characters can be swapped in-place, reducing space complexity from O(n) to O(1)
        for ( int i = 0; i< s.length/2;i++){
            char t = s[l];
            s[l] = s[r];
            s[r] = t;
            l++;
            r--; }
    }
}