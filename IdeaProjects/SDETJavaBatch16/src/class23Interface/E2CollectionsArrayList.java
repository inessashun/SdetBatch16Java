package class23Interface;

import java.util.ArrayList;

public class E2CollectionsArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Moncef"); //0 index
        names.add("Vlad");
        names.add("Axel");
        names.add("Adam");
        names.add("Marina");
        System.out.println(names); //5 names in a List
        System.out.println(names.size()); //will print how many names we are stored
        System.out.println(names.contains("Sarah")); //we get False, name is not in a List
        System.out.println(names.get(0)); //Moncef
        names.remove("Vlad"); //remove by name
        names.remove(0); //remove by index
        names.indexOf("Marina"); //

        System.out.println(names); //Vlad removed from the List
        System.out.println(names.size()); //4 names to print
        System.out.println(names.indexOf("Marina"));

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
