import java.util.*;

public class Task36 {
    public static void main(String[] args) {

        String[] str = {"eat", "ate", "tea", "tan", "nat", "bat"};
        List<List<String>> lists = groupedAnagrams(str);
        System.out.println(lists);

    }
    static List<List<String>>groupedAnagrams(String[] strings){
        List<List<String>>groupAnagram = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            char[] charArr = strings[i].toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
                map.get(sorted).add(strings[i]);
        }
        groupAnagram.addAll(map.values());
        return groupAnagram;
    }
}
