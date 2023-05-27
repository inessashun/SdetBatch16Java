package class24;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {
        int num=10;
        int num1=20;

        ArrayList<Integer>number=new ArrayList<>();
        //datatype is being converted automatically from int to Integer (auto Boxing)
        number.add(num);
        number.add(num1);
        //datatype is being converted automatically from Integer to int(auto Unboxing)
        int number3=number.get(0);
    }
}
