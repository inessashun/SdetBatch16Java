package class24;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(100);
        numbers.add(200);
        System.out.println(numbers); // [10, 20, 100, 200]

        System.out.println("***** Enhanced For Loop ******"); //used 95%
        for (Integer num:numbers) { //enhanced ForLoop is PREFERRED to use !!!
            System.out.print(num);  // 10, 20, 100, 200  - without brackets
        }
        System.out.println("****** For Loop *****"); //used 95%

        for (int i = 0; i < numbers.size(); i++) { // normal ForLoop
            System.out.println(numbers.get(i));
        }

        System.out.println("******While Loop*****"); //used 5%
        int i=0;
        while (i<numbers.size()){
            System.out.println(numbers.get(i));
            i++;
        }

        System.out.println("******Do While Loop*****"); //used almost never
        int j=0;
        do {
            System.out.println(numbers.get(j));
            j++;
        }while (j<numbers.size());

    }
}
