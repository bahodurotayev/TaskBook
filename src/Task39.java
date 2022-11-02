import static java.util.stream.LongStream.range;
import static java.util.stream.LongStream.rangeClosed;

public class Task39 {
    public static void main(String[] args) {
       // classifyNumber(100);

        int i = sumOfProperDivisor(100);
        System.out.println(i);
        Integer integer = properDivsSum(100);
        System.out.println("integer = " + integer);
    }
    static void classifyNumber(int number){
        int abundant = 0;
        int deficiency = 0;
        int perfect = 0;

        for (int i = 1; i <= number; i++){
            int check = sumOfProperDivisor(i);
            if (check > i) {
                abundant++;
            }
            else if (check < i){
                deficiency++;
            }
            else {
                perfect++;
            }
        }

        System.out.println("Deficient number: " + deficiency);
        System.out.println("Perfect number: " + perfect);
        System.out.println("Abundant number: " + abundant);
    }
     static int sumOfProperDivisor(int n){
        int count = 0;
        for (int i = 1; i <n; i++) {
            if (n % i == 0) {
                count += i;
            }
        }
        return count;
    }
    public static Integer properDivsSum(long num) {
        return (int)rangeClosed(1, (num)).filter(i -> num % i == 0 && num != i).sum();
    }
}
