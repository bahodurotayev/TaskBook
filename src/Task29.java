import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task29 {
    static List<Integer> divisible(){
        Random rnd = new Random();
        List<Integer> list = new ArrayList<>();
       int  random = rnd.nextInt(0, 101);
        for (int i = 1; i <= random; i++) {
            if(i % 8 == 0){
                list.add(i);
            }
        }
        System.out.println("random = " + random);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> divisible = divisible();
        System.out.println(divisible);
    }
}
