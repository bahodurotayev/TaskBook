public class Task21 {

    public static void main(String[] args) {

        int x = 16;
        int number = 1;

        boolean isPower = false;

        while(number < x){
            number *= 2;
        }
        if(number == x){
            isPower = true;
        }
        System.out.println(isPower);
    }
}
