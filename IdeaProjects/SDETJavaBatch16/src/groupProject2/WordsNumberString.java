package groupProject2;

public class WordsNumberString {
    public static void main(String[] args) {
        /*
        Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.

         */
        String str = "Hello, world!";
        String[] strArray=str.split(" ");
        System.out.println("Number of Words in a String: " +strArray.length);
    }
}
