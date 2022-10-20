import java.util.*;

public class Task34 {
    public static void main(String[] args) {

        boolean b = backspaceCompare3("#d#", "");
        System.out.println(b);

    }
    public static boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1;
        int j = T.length() - 1;
        int back;
        while (true) {
            back = 0;
            while (i >= 0 && (back > 0 || S.charAt(i) == '#')) {
                back += S.charAt(i) == '#' ? 1 : -1;
                i--;
            }
            back = 0;
            while (j >= 0 && (back > 0 || T.charAt(j) == '#')) {
                back += T.charAt(j) == '#' ? 1 : -1;
                j--;
            }
            if (i >= 0 && j >= 0 && S.charAt(i) == T.charAt(j)) {
                i--;
                j--;
            } else {
                break;
            }
        }
        return i == -1 && j == -1;
    }
    public static boolean backspaceCompare2(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        int iBackspaceCount = 0;
        int jBackspaceCount = 0;

        while(i >= 0 || j >= 0) {

            if(i >= 0 && s.charAt(i) == '#') {
                ++iBackspaceCount;
                --i;
                continue;
            }

            if(j >= 0 && t.charAt(j) == '#') {
                ++jBackspaceCount;
                --j;
                continue;
            }

            if(iBackspaceCount > 0) {
                --i;
                --iBackspaceCount;
                continue;
            }

            if(jBackspaceCount > 0) {
                --j;
                --jBackspaceCount;
                continue;
            }

            if(i >= 0 && j >= 0 && s.charAt(i) == t.charAt(j)) {
                --i;
                --j;
            } else {
                return false;
            }
        }

        return true;
    }
    public static boolean backspaceCompare3(String s, String t) {
        Stack<Character> ss = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '#'){
                ss.push(s.charAt(i));
            }else if(!ss.isEmpty()) {
                ss.pop();
            }
        }
        Stack<Character> tt = new Stack<>();
        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i) != '#'){
                tt.push(s.charAt(i));
            }else if(!tt.isEmpty()){
                tt.pop();
            }
        }
        if(ss.equals(tt)){
            return true;
        }
        return false;
    }
}
