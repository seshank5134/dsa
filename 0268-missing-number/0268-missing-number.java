class Solution {//  have to get non existing within the size of array 
    public int missingNumber(int[] nums) {
       int n= nums.length;
       int expectedSum = n * (n + 1) / 2;
       int sum = 0;
       for ( int x : nums){
            sum += x;// sum of all n* n+1/2 and will remove the actual and expected 
       }
       return expectedSum - sum;// here we remove by complement logic 
            
        }
    }// this be done in xor will do it 
