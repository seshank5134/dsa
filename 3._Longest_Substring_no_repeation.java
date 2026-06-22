import java.util.*;

class Lion{
    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println(los(s));
    }
     public static int los ( String s){
        int l = 0; int r = 0 ; int max = 0;
         Set<Character> set = new HashSet<>();
          for ( int i =0 ; i<s.length(); i++){
            if (!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                r++;
                max = Math.max(max, r-l);
            } else {
                while (set.contains(s.charAt(i))){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(s.charAt(i));
                r++;
            }
          }
          return max;
     }
}