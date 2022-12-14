public class Task41 {
    static int longestConsecutiveOnes(int[] arr){
        int countZero = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                countZero++;
                max = Math.max(max, countZero);
            }else {
                countZero = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr ={1, 1, 1, 0, 1, 1};
        int i = longestConsecutiveOnes(arr);
        System.out.println(i);
    }
}
