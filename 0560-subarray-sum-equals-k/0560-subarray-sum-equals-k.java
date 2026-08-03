class Solution {// have to get numbers which gets target so we need to check frequencies as repeated possible so here hashmap suitable 
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

map.put(0, 1); // to start from 1 we have make sure that if nothing then 0 is present 

int sum = 0;
int count = 0;

for (int num : nums) {
// going through each and every element
    sum += num;

    if (map.containsKey(sum - k)) {// if map contains themn will all the count 
        count += map.get(sum - k);
    }

    map.put(sum, map.getOrDefault(sum, 0) + 1); // will retrive that after check everytime 
}

return count;// our requested from question is count of integers
    }
}