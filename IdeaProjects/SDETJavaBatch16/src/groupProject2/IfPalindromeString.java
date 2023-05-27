package groupProject2;

public class IfPalindromeString {
    public static boolean isPalindrome (String str) {
       /*
       Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.
        */
        char[] array = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (array[i] != array[(str.length() - 1) - i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        if (isPalindrome(str)) {
            System.out.println("Given string is Palindrome");
        } else {
            System.out.println("Given string not a Palindrome");
        }
    }
}
