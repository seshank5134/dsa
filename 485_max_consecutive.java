class Pen {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int maxConsecutiveOnes = fmc(arr);
        System.out.println("Maximum consecutive ones: " + maxConsecutiveOnes);
    }
    public static int fmc(int[] nums){
        int max =0;
         int c = 0;
         for ( int i : nums ){
            if ( i==1) c++;
            else c=0;
            if ( c>max) max = c;
    
         }
         return max;
    }
}