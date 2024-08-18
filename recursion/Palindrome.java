package recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("MALAYALAM: " + isPalindrome("MALAYALAM"));
        System.out.println("ABCCBA: " + isPalindrome("ABCCBA"));
        System.out.println("PALINDROME: " + isPalindrome("PALINDROME"));
    }

    static boolean isPalindrome(String str) {
        return helper(str, 0);
    }

    static boolean helper(String str, int i) {
        int j = str.length() - i - 1;

        if (i >= j)
            return true;

        if (str.charAt(i) != str.charAt(j))
            return false;

        return helper(str, i + 1);
    }
}
