import java.util.Arrays;

public class Task31 {

    static Boolean checkIfAnagram3(String str1, String str2){
        if(str1.length()!=str2.length()) return false;
        int[] ar1=new int[26];
        int[] ar2=new int[26];
        for(int i=0; i<str1.length(); i++){
            ar1[str1.charAt(i)-'a']++;
            ar2[str2.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            if(ar1[i]!=ar2[i]) return false;
        }
        return true;
    }
    static Boolean checkIfAnagram2(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < ch2.length; i++) {
            if(ch1[i] == ch2[i]){
                return true;
            }
        }
        return false;
    }
    static Boolean checkIfAnagram(String str1, String str2){
        boolean isAnagram = false;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i) == str2.charAt(j)){
                  isAnagram = true;
                  break;
                }else {
                    isAnagram = false;
                }
            }
        }
        return isAnagram;
    }
    public static void main(String[] args) {
        String str = "mom";
        String str2 = "mom";
        Boolean aBoolean = checkIfAnagram(str, str2);
        System.out.println("aBoolean = " + aBoolean);
    }
}
