public class Task7 {
    /* Create a method which will take a String as a parameter and return type is char.
    This method should return a character which is mostly repeated.

            Example:
    String = "aaaabbacccccdddccaaaddddaac"
    Output should be c.
*/
    static Character longestConsecutiveChar (String str){
        char temp = ' ';
        char finalChar = ' ';
        int count = 0;
        int preCount = 0;

        for (int i = 0; i <str.length() ; i++) {
            temp = str.charAt(i);
            count = 1;
            for (int j = i + 1; j <str.length() ; j++) {
                if(temp == str.charAt(j)){
                    count++;
                    if(preCount < count){
                        finalChar = temp;
                        preCount = count;
                    }
                }else {
                    i=j-1;
                    break;
                }
            }
            //System.out.println(temp + " " + count);
        }
        return finalChar;
    }
    public static void main(String[] args) {

        String str = "aaaabbacccccdddccaaaddddaac";
        Character integer = longestConsecutiveChar(str);

        System.out.println(integer);

    }
}
