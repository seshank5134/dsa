class Solution {// ransom note
    public boolean canConstruct(String ransomNote, String magazine) {
         int[] arr = new int[26];
        for (char c : magazine.toCharArray()) {// with asci calcluation save every thing from magzine 
            arr[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {// going to all elements and checking if magzine is not in ransome 
            if (--arr[c - 'a'] < 0) {
                return false;
            }
        }
        return true;     
    }
}