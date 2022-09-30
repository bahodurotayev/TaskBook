import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "f", "g", "e", "g" ,"c", "e", "t", "a", "c", "v", "a", "e", "v", "d"));
        Map<String, Boolean> map = checkKey(list);
        System.out.println(map);

    }
    static Map<String, Boolean> checkKey (ArrayList<String> list){
        Map<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j)) && i != j){
                    map.put(list.get(i), true);
                    break;
                } else if (!list.get(i).equals(list.get(j))&& i != j) {
                    map.put(list.get(i), false);
                }
            }
        }
        return  map;
    }
}
