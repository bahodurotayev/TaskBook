public class Task24 {

    static boolean check2Array(int[] arr1, int[] arr2){

        if(arr1[0] == arr2[0] || arr1[arr1.length-1] == arr2[arr2.length - 1]){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        /*[1, 2, 3], [7, 3] → true
        [1, 2, 3], [7, 3, 2] → false
        [1, 2, 3], [1, 3] → true
        [1, 2, 3], [1, 7, 5, 2]*/

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 3};

        boolean b = check2Array(arr1, arr2);
        System.out.println(b);
    }
}
