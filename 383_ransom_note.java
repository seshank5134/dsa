class Main{
    public static void main( String[] args){
        String r= "aa";
        String s = "aab";
        System.out.println(RN(r,s));

    }
    public static boolean RN(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (char c : magazine.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (--arr[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }}
    