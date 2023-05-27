package class12StringMethods;

public class E9StringDemoSentenceEndsContains {
    public static void main(String[] args) {
        String sentence="seeI don't see SEARch result";

        System.out.println(sentence.endsWith("result"));
        System.out.println(sentence.contains("see"));
    }
}
