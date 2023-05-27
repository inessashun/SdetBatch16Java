package groupProject2;

public class ReverseString {
    public static void main(String[] args) {
        /*
        Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH".

         */
        String word="Hello";
        String reverse = new StringBuffer(word).reverse().toString();
        System.out.println(reverse);
    }
}
