package class24;

import class18InheritanceParentChild.A;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {
        ArrayList<String> makeup=new ArrayList<>();
        makeup.add("nailPolish");

        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");

        ArrayList<String> grocery=new ArrayList<>();
        grocery.addAll(makeup);
        grocery.addAll(fruit);
        grocery.addAll(grocery);

    }
}
