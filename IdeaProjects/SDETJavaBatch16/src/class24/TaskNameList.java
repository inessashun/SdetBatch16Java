package class24;

import java.util.ArrayList;

public class TaskNameList {
    public static void main(String[] args) {
        /*
        Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
         */
        ArrayList<String> names = new ArrayList<>();
        names.add("Rajbeer");
        names.add("Vlad");
        names.add("Asghar");
        names.add("Sohail");
        names.add("Marina");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Rajbeer"));
        System.out.println(names.size());
        System.out.println(names);


    }
}
