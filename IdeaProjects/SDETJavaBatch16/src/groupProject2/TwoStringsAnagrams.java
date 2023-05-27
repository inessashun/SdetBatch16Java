package groupProject2;

public class TwoStringsAnagrams {
    public static void main(String[] args) {
        /*
        Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.
         */
        System.out.println(isAnagram("listen", "silent"));
    }
    public static boolean isAnagram(String str1, String str2) {
    int order[] = new int[512];
        for (int i = 0; i < str1.length(); i++) {
        order[str1.charAt(i)]++;
        order[str2.charAt(i)]--;
    }
        for ( int i = 0; i < order.length; i++){
        if (order[i] != 0) {
            return false;
        }
    }
        return true;
    }
}
