package class24;

import java.util.ArrayList;

public class TaskWordsList {
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

        System.out.println(words);

        System.out.println("*****Normal ForLoop*****");

        for (int i =0 ; i <words.size(); i++) {
            String word = words.get(i);
            if (word.endsWith("e")) {
                words.remove(i);
                i--;
            }
        }
        System.out.println(words);

        System.out.println("*****Enhanced ForLoop*****");


    }
}
