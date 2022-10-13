import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public class Task30 {
    static int nonRepeatingCharsIndex(String str) {
    int result = Integer.MAX_VALUE;
    int firstOccurrenceIndex = -1;

    for (char ch = 'a'; ch <= 'z'; ch ++){
        firstOccurrenceIndex = str.indexOf(ch);
        if(firstOccurrenceIndex != -1 && firstOccurrenceIndex == str.lastIndexOf(ch)){
            result = Math.min(firstOccurrenceIndex, result);
            }
        }
    if(result == Integer.MAX_VALUE){
        return -1;
        }
    return result;
    }
    public static void main(String[] args) {
        String str = "momo";
        int i = nonRepeatingCharsIndex3(str);
        System.out.println(i);
    }
    static int nonRepeatingCharsIndex2(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.computeIfAbsent(str.charAt(i), k-> 0);
            map.computeIfPresent(str.charAt(i), (k,v)-> v += 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
    static int nonRepeatingCharsIndex3(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
                if(!map.containsKey(str.charAt(i))){
                  map.put(str.charAt(i), i);
                }else {
                    map.put(str.charAt(i), -1);
                }
        }
        int min = Integer.MAX_VALUE;
        for (char c:map.keySet()) {
            if(map.get(c) > -1 && map.get(c) < min){
                min = map.get(c);
            }
        }
        return min == Integer.MAX_VALUE ? - 1 : min;
    }
}
