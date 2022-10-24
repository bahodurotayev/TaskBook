public class PeakNumber {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 7, 6, 5, 9, 12, 9, 7, 1};
        int i = peakNumber(arr);
        System.out.println(i);
    }
    static int peakNumber(int[]arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}
