package class14MethodsArrayOthers;
/*
Write code that will take in a String input and check to see if it is a
palindrome or not.
A palindrome means that the characters are the same forwards and
backwards, ignoring spaces examples level madam kayak
 */

public class TaskReplit99Palindrome {
    //car => rac Madam => madaM
    boolean isPalindrome(String str){
        String reversedStr=" ";
        for (int i=str.length()-1; i>=0; i--){
            reversedStr=reversedStr+str.charAt(i);
        }
        boolean isStrPalindrome=false;
        if(str.equalsIgnoreCase(reversedStr)){
            isStrPalindrome=true;
        }
        return isStrPalindrome;
    }
    boolean isPalindromeSB(String str) {
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }

    public static void main(String[] args) {
        TaskReplit99Palindrome task=new TaskReplit99Palindrome();
        boolean result= task.isPalindrome("Madam");
        System.out.println(result);

    }
}
