class Solution {// big o( 1) and space o(1)
    public boolean canWinNim(int n) {
        return n % 4 != 0;// can win unless 4 multiples 
    }
}