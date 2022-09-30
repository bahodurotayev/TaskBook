import java.util.HashMap;
import java.util.Map;

public class Task3 {

//          {"spinach": "dirt", "ice cream": "cherry"}
//          Result:
//          {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("spinach", "dirt");
        map.put("ice cream", "cherry");

        modifyMap(map);
        System.out.println(map);

    }

    static HashMap<String, String> modifyMap (HashMap<String, String> map){ // WAY - 1

        for (Map.Entry<String, String> eachString : map.entrySet()) {
            if(eachString.getKey().equals("spinach")){
                map.replace(eachString.getKey(), "nuts");
            }else if (eachString.getKey().equals("ice cream")){
                map.put("yogurt", eachString.getValue());
            }
        }
        return map;
    }

    static HashMap<String, String> modifyMap2 (HashMap<String, String> map){



        return map;
    }

}
