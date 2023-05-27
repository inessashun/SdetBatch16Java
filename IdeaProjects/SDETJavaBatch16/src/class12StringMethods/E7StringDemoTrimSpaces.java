package class12StringMethods;

public class E7StringDemoTrimSpaces {
    public static void main(String[] args) {
        String sentence="     Java    is fun     "; //inside sentence it CANNOT move spaces
        System.out.println(sentence);
        System.out.println(sentence.trim());
    }
}
