class Solution {
    public int lengthOfLongestSubstring(String s) {
         int l = 0; int r = 0 ; int max = 0;
         Set<Character> set = new HashSet<>();
          for ( int i =0 ; i<s.length(); i++){
            if (!set.contains(s.charAt(i))){
                set.add(s.charAt(i)); // add the character which is not in the map onlu 
                r++;
                max = Math.max(max, r-l);
            } else {
                while (set.contains(s.charAt(i))){
                    set.remove(s.charAt(l)); // if checks happen will remove the 
                    l++;
                }
                set.add(s.charAt(i));
                r++;
            }
          }
          return max;
    }
}// same window sliding where we check if the repetation happens will stop and say the count 