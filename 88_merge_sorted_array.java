import java.util.Arrays;
class Crane{
    public static void main( String [] args ){
        int [] nums1 = { 1, 2, 3, 0, 0, 0};
        int [] nums2 = { 2, 5, 6};
        int n = 3, m = 3;
         merge(nums1, n, nums2, m);
        System.out.println(Arrays.toString(nums1));
            
        }
        public static void merge( int [] nums1 , int n , int [] nums2 , int m){
            int x = m - 1; // Pointer for the last element in nums1's initial part
            int y = n - 1; // Pointer for the last element in nums2
            int z = n + m - 1; // Pointer for the last position in nums1

            while (x >= 0 && y >= 0) {
                if (nums1[x] > nums2[y]) {
                    nums1[z] = nums1[x];
                    x--;} else {
                     nums1[z] = nums2[y];
                             y--; }
                z--;
            }
            // If there are remaining elements in nums2, copy them
            while (y >= 0) {
                nums1[z] = nums2[y];
                y--;
                z--;
            }
            
        }
    }
