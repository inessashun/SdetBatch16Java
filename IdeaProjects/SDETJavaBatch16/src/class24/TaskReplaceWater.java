package class24;

import java.util.ArrayList;

public class TaskReplaceWater {
    public static void main(String[] args) {
        /*
        replace with WATER words with"e" "a"
         */
        ArrayList<String> words=new ArrayList<>();
        words.add("Juice");
        words.add("Milk");
        words.add("Tea");
        words.add("Coffee");
        words.add("Soda");

        System.out.println("Remove If ends with E");
        words.removeIf(x-> x.endsWith("e"));
        System.out.println(words);

        System.out.println("replace with WATER words with E or A");
        for (int i = 0; i < words.size(); i++) {
            String word=words.get(i);
            if(word.contains("e")||word.contains("a")){
                words.set(i,"Water");
            }
        }
        System.out.println(words);

        System.out.println("LAMBDA method");
        words.replaceAll(x-> {
            if(x.contains("a")||x.contains("e")){
                return "Water";
            }else{
                return x;
            }
        });
        System.out.println(words);

        System.out.println("LAMBDA method");
        words.replaceAll(x-> x.contains("a")||x.contains("e")?"Water":x);
        System.out.println(words);
    }
}
