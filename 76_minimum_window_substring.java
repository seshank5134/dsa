  import java.util.*; 
  class  Park{
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = minWindow(s, t);
        System.out.println(result);
    }
 public  static String minWindow(String s, String t) {  int left = 0 ;
  int matched = 0 ;
  int start = 0 ;

int minLength = Integer.MAX_VALUE;
    HashMap<Character, Integer> needCount = new HashMap<>();
    HashMap<Character, Integer> windowCount = new HashMap<>();
     for (char c : t.toCharArray()) {
        needCount.put(c, needCount.getOrDefault(c, 0) + 1);
    }
    for (int right = 0; right < s.length(); right++) {      
            
        char rightChar = s.charAt(right);
        windowCount.put(rightChar, windowCount.getOrDefault(rightChar, 0) + 1);
        if (needCount.containsKey(rightChar) && windowCount.get(rightChar).intValue() == needCount.get(rightChar).intValue()) {
            matched++;
        }
        while (matched == needCount.size()) {
            if (right - left + 1 < minLength) {
                minLength = right - left + 1;
                start = left;
            }
            char leftChar = s.charAt(left);
            windowCount.put(leftChar, windowCount.get(leftChar) - 1);
            if (needCount.containsKey(leftChar) && windowCount.get(leftChar).intValue() < needCount.get(leftChar).intValue()) {
                matched--;
            }
            left++;
        }
    }

    
  return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
}}