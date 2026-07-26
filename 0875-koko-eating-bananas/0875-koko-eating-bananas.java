class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
         int right = Arrays.stream(piles).max().getAsInt(); // to get max of piles array
         int ans = right ;
        while(left<=right){
             int mid = left + (right - left) / 2; 
             long hours =0;
            for (int pile : piles ){ 
             hours += (pile + mid - 1) / mid;// maths ceil formula 
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