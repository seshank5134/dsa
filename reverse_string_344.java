class Main{
    public static void main(String [] args ) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};  
            reverseString(s);
            System.out.println(s);
    } 

     public static void reverseString(char[] s) {
        int l = 0; int r = s.length-1;
        for ( int i = 0; i< s.length/2;i++){
            char t = s[l];
            s[l] = s[r];
            s[r] = t;
            l++;
            r--;
        }
}
}
