class Solution {// complexity of space and time is o(long n)
// we need to check whthere summ of digitd of the given n is finlie to be 1 then happy or else not 
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();// to get unique values 
        while (n != 1 && !seen.contains(n)) {// will chek here is n == 1 and if not we have to add the n to created set so that if repeated then not possible to be happy
            seen.add(n); // adding number ot set 
            n = getNext(n);// using the method of getNext()
        }
        return n == 1;
    }

    private static int getNext(int n) {// created a method for adding the sums of squares of the digit 
        int totalSum = 0;
        while (n > 0) {
            int digit = n % 10;// to get unit value and stored in digit 
            totalSum += digit * digit;// square of that digit 
            n /= 10; // remove from back ex ( 12 = first 2 then 2*2 then 4 and 1 then 1*1+4 then total sum is 5 which is not happy number )
        }
        return totalSum;
    }
}