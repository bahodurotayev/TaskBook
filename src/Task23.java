import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Task23 {

    @Test
    public void checkEvenNumber(){
        Assert.assertTrue(Number.checkEvenNumber(20));
    }
    @Test
    public void EvenNumber(){
        int length = Number.evenNumber(20).size();
        Assert.assertEquals(length, Number.evenNumber(20).size());
    }
}
class Number{
    static Boolean checkEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
    static ArrayList<Integer> evenNumber(int x){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=x ; i++) {
            if(i % 2 == 0){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = Number.evenNumber(20);
        System.out.println(list);
    }
}