package class23Interface;

import java.util.ArrayList;

public class E1CollectionsArray {
    public static void main(String[] args) {

        String name="Vera";
        String name1="Vera";
        String [] names={"Vera","Max" };

        int size=2;
        String [] names2=new String[size];
        names2[0]="Semir";

        ArrayList<String> arrayList=new ArrayList<>(50);//up to 50 no ISSUES
        arrayList.add("Oks");
        arrayList.add("Ramil");
        arrayList.add("Ramil");
        arrayList.add("Ramil");
        arrayList.add("Ramil");
        arrayList.add("Rama");
        System.out.println(arrayList);
    }
}
