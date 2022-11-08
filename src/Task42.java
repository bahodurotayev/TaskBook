public class Task42 {
    static int longestConsecutiveOnes2(int[] arr) {
        int maxLength = 0;
        int counter = 0;
        int left = 0;
        int right = 0;

        while (right < arr.length){
            if (arr[right] == 0){
                counter ++;
            }
            while (counter > 1){
                if (arr[left] == 0){
                    counter --;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 0};
        int i = longestConsecutiveOnes2(arr);
        System.out.println(i);
    }
}