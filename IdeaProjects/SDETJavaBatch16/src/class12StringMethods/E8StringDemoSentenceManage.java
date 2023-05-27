package class12StringMethods;

public class E8StringDemoSentenceManage {
    public static void main(String[] args) {
        String sentence="Java is easy";
        //method chaining and its possible in String class
        //method chaining calling multiple methods on the same line
        sentence=sentence.trim().toLowerCase();
        System.out.println(sentence);

        //String searchWord="Java";
        System.out.println(sentence.startsWith("Java")); //lower case or space gives false
    }
}
