package class14MethodsArrayOthers;
/*/*
Write code that will take in a String input and check to see if it is a
palindrome or not.
A palindrome means that the characters are the same forwards and
backwards, ignoring spaces examples level madam kayak
 */

public class Task2Palindrome {
    //FROM THE CLASS 14
    // car => rac ; Madam => madaM

    boolean isPalindrome(String str) {
    //String lowerCaseStr=str.toLowerCase(); //=> if we want to convert into lower case
        String reversedStr = "";   //=> equals "" empty parameters
        for (int i = str.length() - 1; i >= 0; i--) {  //=> Reversed String
            reversedStr = reversedStr + str.charAt(i);
        }

        boolean isStrPalindrome = false;
        if (str.equalsIgnoreCase(reversedStr)) {   //=> Original String
            isStrPalindrome = true;
        }
        return isStrPalindrome;
    }
    //Other Example => with SB - StringBuilder
    boolean isPalindromeSB(String str) {
        /*   ===  Step by step Explanation:  ===
        new StringBuilder(str) => converts the String to a StringBuilder
        reverse()=> it reverses the contents in StringBuilder
        toString()=> it converts the Stringbuilder back to a String
        equalsIgnoreCase(str)=> comparing the reversed String to original one
         */
        //easy way to do it
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }

    public static void main(String[] args) {
        Task2Palindrome task2 = new Task2Palindrome();
        boolean result = task2.isPalindrome("madam");
        System.out.println(result); //true
    }
}
