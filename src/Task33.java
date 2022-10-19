public class Task33 {
    static int findThePeakElement(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            int mid = left + (right - left)/2;
            if(arr[mid] < arr[mid + 1]){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 7, 6, 5, 9, 12, 9, 7, 1};
        int thePeakElement = findThePeakElement2(arr);
        System.out.println("index : " + thePeakElement);
    }

    static  int findThePeakElement2(int[] nums) {
        int length = nums.length;
        int start =0;
        int end= nums.length-1;
        while(end >= start){
            int mid = (start + end)/2;
            if((mid == 0 || nums[mid-1] <= nums[mid]) && (mid == (length-1) || nums[mid]  > nums[mid+1])){
                return mid;
            }
            if(mid > 0 && nums[mid] >= nums[mid+1]) {
                end = mid-1;
            }
            else start = mid+1;
        }
        return -1;
    }
}
