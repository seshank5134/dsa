class Main{
    public static void main(String[] args) {
        String s = "A man, A plan, a canal: Panama";
        System.out.println(isPalindrome(s));
}
public static boolean isPalindrome(String s) {
    // // String[] arr = s.toLowerCase().split("");
    //  int n= arr.length;
    // for (int i = 0;  i < n; i++ ) {
    //     if (!arr[i].equals(arr[n-1-i])
    //     && Character.isLetterOrDigit(arr[i].charAt(0)) 
    //     && Character.isLetterOrDigit(arr[n-1-i].charAt(0))) {
    //         return false;
    //     }
    // }
    // return true;
    s= s.toLowerCase();
    int l = 0;
     int r = s.length()-1;
     while (l<r){ if (!Character.isLetterOrDigit(s.charAt(l))) {
         l++;
     } else if (!Character.isLetterOrDigit(s.charAt(r))) {
         r--;
     } else if (s.charAt(l) != s.charAt(r)) {
         return false;
     } else {
         l++;
         r--;
     }}
     return true;
}
}
