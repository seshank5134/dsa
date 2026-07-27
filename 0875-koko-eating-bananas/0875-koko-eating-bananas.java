class Solution {// binary search 
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;// minimum would be eating of bananas is 1 per hour so left be 1
         int right = Arrays.stream(piles).max().getAsInt(); // to get max of piles array  this is method for getting maximum number from the array pile which is arrays.stream().max().getAsIn().
         int ans = right ; // as max may become answer if eating per hour least is 1 ( like 30 max minimum eating is 1 then answer is 30 )
        while(left<=right){
             int mid = left + (right - left) / 2; 
             long hours =0;
            for (int pile : piles ){ 
             hours += (pile + mid - 1) / mid;//  instead of  maths.ceil()maths ceil formula 
                                    }

             if(hours<=h){
                ans = mid ;
                right = mid-1;
                         }else {
                left = mid+1;
                                }
        }
        return ans;
    }
}