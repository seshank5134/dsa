class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0; int maxlen = 0;
        
    
        HashMap<Integer, Integer> map = new HashMap <>(); // we see here we need to consequtive window with highest count of only two discint means we have to check the known ones so we use hashmap 
        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right],
        map.getOrDefault(fruits[right], 0) + 1); // will add just incase for a default 0 for value of the key 
  

    while (map.size() >2) { // we hvae to take only two disinct fruits so if we have more need to remove and we are in the window right so will remove then left part in the below 

        map.put(fruits[left],map.get(fruits[left]) - 1);
        if (map.get(fruits[left]) == 0) { // we have to remove te element whose count become 0 so that we can add next elemet 

            map.remove(fruits[left]); // here removing from left for next consequtuve 
        }

        left++;
    }

    maxlen =Math.max(maxlen,right-left+1); 
}
return maxlen;
    }
}