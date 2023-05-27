package class12StringMethods;

public class E12StringDemoSubstring {
    public static void main(String[] args) {
        String sentence="yup we have another class";
        System.out.println(sentence.substring(7)); //print starts at index#7 of the sentence (have another class)
        System.out.println(sentence.substring(4, 11)); //print starts at index#4 and ends at Index#11 of the sentence (we have)
        System.out.println(sentence.substring(12, 19)); //print starts at index#12 and ends at Index#19 of the sentence (another)

        int startIndex=sentence.length()-5; //print last 5 letters in a sentence
        System.out.println(sentence.substring(startIndex)); // to print last word => (class)
    }
}
