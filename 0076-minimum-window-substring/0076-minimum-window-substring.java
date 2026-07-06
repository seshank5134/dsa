class Solution {// best sliding problem with greedy one 
    public String minWindow(String s, String t) { // done by vs code 
    // here its like a greedy one  when the need count and window count matches we will shrink form left and check the need == count if then re shrink 
    // if not equal then wwe have to rpxpand and gaina and will check this that wheter is window and need count be equal and both have sam e elements 
    // our final funda is like taking a minimum substring from s where it have all elements from t 
        int left = 0 ; 
          int matched = 0 ;
  int start = 0 ;

int minLength = Integer.MAX_VALUE;
    HashMap<Character, Integer> needCount = new HashMap<>();// need map
    HashMap<Character, Integer> windowCount = new HashMap<>();// window map
     for (char c : t.toCharArray()) {
        needCount.put(c, needCount.getOrDefault(c, 0) + 1); // into need map 
    }
    for (int right = 0; right < s.length(); right++) {      
            
        char rightChar = s.charAt(right);
        windowCount.put(rightChar, windowCount.getOrDefault(rightChar, 0) + 1);
        if (needCount.containsKey(rightChar) && windowCount.get(rightChar).intValue() == needCount.get(rightChar).intValue()) {
            matched++; // when the window have the need size then we have to add the matched increase 
        }
        while (matched == needCount.size()) {
            if (right - left + 1 < minLength) {
                minLength = right - left + 1;
                start = left;
            }
            char leftChar = s.charAt(left);
            windowCount.put(leftChar, windowCount.get(leftChar) - 1);
            if (needCount.containsKey(leftChar) && windowCount.get(leftChar).intValue() < needCount.get(leftChar).intValue()) {
                matched--;// if the need count is not in window we have to decrease match and expand so we can reach that count 
            }
            left++;
        }
    }

    
  return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);// teritoary expression here 
    }
}// all sliding windows got same patteren just it will hacve change in condition 