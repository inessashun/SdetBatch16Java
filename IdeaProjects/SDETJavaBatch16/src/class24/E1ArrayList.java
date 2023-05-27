package class24;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<>();
        /*
        ArrayList class => what you place in <..> , all codes in this ArrayList class will
        change  methods  to <String> or <Integer> or <Double> /etc.
        Object obj=new String/ArrayList/Scanner/Integer/Char() => Object is a Superclass
        we can add any classes => Object(parent)-String/ArrayList/Scanner/Integer/Char(child)
        */
        ArrayList<Integer> arrayList1=new ArrayList<>();
        /*Integer integer=new Integer(10); // => shorter syntax just => = 10;
        Integer integer1=new Integer(20);  // => shorter syntax just => = 20;
        System.out.println(integer1+integer);*/    // => this is normal objects created

        /*For Repl classes we can named non-primitive datatypes:
        byte=Byte
        short=Short
        int=Integer
        long=Long
        float=Float
        double=Double
        boolean=Boolean
        char=Character
         */
        System.out.println(Integer.MAX_VALUE); //Maximum numbers we can store in int class
        int num=10;
    }
    static void add(Integer a, Integer b){

    }
}
