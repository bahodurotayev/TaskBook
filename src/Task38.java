public class Task38 {
    public static void main(String[] args) {
        boolean uglyNumber = isUglyNumber(18);
        System.out.println(uglyNumber);
    }
    static boolean isUglyNumber(int number){
        while (number != 1){
            if(number % 5 == 0){
                number = number / 5;
            } else if (number % 3 == 0) {
                number = number / 3;
            }else if (number % 2 == 0) {
                number = number / 2;
            }else {
                return false;
            }
        }
        return true;
    }
}
