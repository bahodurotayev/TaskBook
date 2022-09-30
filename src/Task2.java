import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        map.put("USA", new ArrayList(Arrays.asList("Boston","NewYork","San-Francisco")));
        map.put("INDIA", new ArrayList(Arrays.asList("Bangalore","Mumbai","Delhi")));
        map.put("UK", new ArrayList(Arrays.asList("Leicester","London","Birmingham")));

        modifyMap(map);
        System.out.println(map);

    }
    static ArrayList<String> modifyList (ArrayList<String> list, char ch){
//          WAY -1
//        for (int i = 0; i < list.size(); i++) {
//            if((list.get(i).charAt(0) == ch)){
//                list.remove(list.get(i));
//            }
//        }

        list.removeIf(eachList -> eachList.charAt(0) == ch);

        return list;
    }

    static HashMap<String, ArrayList<String>> modifyMap (HashMap<String, ArrayList<String>> map){

        for (Map.Entry<String, ArrayList<String>> eachEntry : map.entrySet()) {
            if(eachEntry.getKey().equals("USA")){
                map.put(eachEntry.getKey(), modifyList(eachEntry.getValue(), 'S'));
            } if(eachEntry.getKey().equals("INDIA")){
                map.put(eachEntry.getKey(), modifyList(eachEntry.getValue(), 'M'));
            }if(eachEntry.getKey().equals("UK")){
                map.put(eachEntry.getKey(), modifyList(eachEntry.getValue(), 'B'));
            }
        }
        return map;
    }
}
