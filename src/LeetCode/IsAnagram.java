package LeetCode;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        String a = "mom";
        String b = "mam";

        char[] achar = a.toCharArray();
        char[] bchar = b.toCharArray();

        Arrays.sort(achar);
        Arrays.sort(bchar);

        boolean isAnagram = false;
        for (int i = 0; i < achar.length; i++) {
            if(achar[i] == bchar[i]) {
                isAnagram = true;
            }
        }
        System.out.println(isAnagram);
    }
}
