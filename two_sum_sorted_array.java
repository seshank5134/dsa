class Can {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 18;
        int[] result = twoSum(numbers, target);
        System.out.println("Indices: " + (result[0] - 1) + ", " + (result[1] - 1));
    }

public static int[] twoSum(int[] numbers, int target){
    int le= 0; int  ri= numbers.length-1;
    for ( int i = 0 ; i<numbers.length;i++){
        if (numbers[le]+numbers[ri]==target){
            return new int[]{le+1,ri+1};
        } else if (numbers[le]+numbers[ri]<target){
            le++;
        } else {
            ri--;
        }
    }
    return new int[]{-1, -1};
} 
}