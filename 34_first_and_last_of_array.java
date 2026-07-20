class Main{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 3, 4, 5};
       System.out.println(Search(arr, 3));
    }
    public static int[] Search(int nums[], int target){
           
            int first = binarySearch(nums, target, true);
            int last = binarySearch(nums, target, false);
            return new int[]{first, last};
        }
        public static int binarySearch(int nums[], int target, boolean findFirst){
            int left = 0; int right = nums.length - 1;
            int result = -1;
            while(left <= right){
                int mid = left + (right - left) / 2;
                if(nums[mid] == target){
                    result = mid;
                    if(findFirst){
                        right = mid - 1;
                    }else{
                        left = mid + 1;
                    }
                }else if(nums[mid] < target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            return result;
        }
    }
