package practice;

public class Palindrome {
    static boolean isPalindrome2(String str) {
        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome(String str) {
        if (str.isEmpty()) {
            return true;
        }
        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            char charStart = str.charAt(start);
            char charEnd = str.charAt(end);
            if (!Character.isLetterOrDigit(charStart)) {
                start++;
            } else if (!Character.isLetterOrDigit(charEnd)) {
                end--;
            } else {
                if (Character.toLowerCase(charStart) != Character.toLowerCase(charEnd)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }

    static boolean isPalindrome3(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int j = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }

    static boolean isPalindromeNumber(int number) {
        int result = 0;
        int temp = number;
        while (temp > 0) {
            result = (result * 10) + temp % 10;
            temp /= 10;
        }
        return result == number;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean b = isPalindrome3(str);
        System.out.println("String is Palindrome : "+b);

        int number = 1112;
        boolean palindromeNumber = isPalindromeNumber(number);
        System.out.println("Number is Palindrome : " + palindromeNumber);
    }
}
