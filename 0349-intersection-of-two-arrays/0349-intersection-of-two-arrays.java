class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //   ArrayList<Integer> list = new ArrayList<>();

        // for (int i = 0; i < nums1.length; i++) {

        //     for (int j = 0; j < nums2.length; j++) {

        //         if (nums1[i] == nums2[j]) {

        //             // Check if already present
        //             if (!list.contains(nums1[i])) {
        //                 list.add(nums1[i]);
        //             }

        //             break;
        //         }
        //     }
        // }

        // // Convert ArrayList to int[]
        // int[] result = new int[list.size()];

        // for (int i = 0; i < list.size(); i++) {
        //     result[i] = list.get(i);
        // }

        // return result;
Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        // Store nums1 elements
        for (int num : nums1) {
            set1.add(num);
        }

        // Find common elements
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        // Convert Set to int[]
        int[] result = new int[intersection.size()];

        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }

        return result;
    }
}