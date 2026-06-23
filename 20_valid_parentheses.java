class Main{
    public static void main(String [] args){
        String s = "((()))";
        System.out.println(VP(s));
    }

    public static boolean VP(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }
}