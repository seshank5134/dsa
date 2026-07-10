class Solution {//Time Complexity: \(O(N)\) because you loop through the array exactly once.Space Complexity: \(O(1)\) because you only use two primitive integer tracking variables.
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {// just need to save last (previous one ) and check next if its high will get most profit by this way 
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}