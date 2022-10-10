import java.util.ArrayList;

public class Task22 {

    /*  create class Numbers
    -- create method named as "checkEvenNumber",which returns true if provided integer is even
    -- create a method "evenNumbers" which will return all even number between 0 and 20*/
    static Boolean checkEvenNumber(int x){

        if(x % 2 == 0){
            return true;
        }
        return false;
    }

    static ArrayList<Integer> evenNumbers(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            if(i % 2 == 0){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Boolean aBoolean = checkEvenNumber(2);
        System.out.println(aBoolean);

        ArrayList<Integer> list = evenNumbers();
        System.out.println(list);
    }
}
