package class24;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskWordsIterator {
    public static void main(String[] args) {
        /*
        Create an arrayList of words.
        Remove every word that ends with “e”.
         */
        ArrayList<String> words=new ArrayList<>();
        words.add("Rajbe");
        words.add("Vlade");
        words.add("Asghar");
        words.add("Sohail");
        words.add("Marina");

        words.removeIf(word-> word.endsWith("e")); //removeIf used from Java8 Version

        /*Iterator<String> iterator=words.iterator();

        while(iterator.hasNext()){
            String word=iterator.next();
            if (word.endsWith("e")){
                iterator.remove();
            }
        }*/
        System.out.println(words);
    }
}
