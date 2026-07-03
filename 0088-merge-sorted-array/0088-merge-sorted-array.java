class Solution {// have to remove 00 and merge both and sort 
    public void merge(int[] nums1, int m, int[] nums2, int n) {
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