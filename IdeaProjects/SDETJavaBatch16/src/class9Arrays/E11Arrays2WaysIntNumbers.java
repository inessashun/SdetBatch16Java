package class9Arrays;

public class E11Arrays2WaysIntNumbers {
    public static void main(String[] args) {
        /*
        There are two ways of creating arrays
        new int[5] => create an array of int with size 5
         */
        int [] numbers=new int [5];
            numbers[0]=50; // store 50 on index 0
            numbers[1]=60; // store 100 on index 1
            numbers[2]=70; // store 100 on index 2
            numbers[3]=80; // store 100 on index 3
            numbers[4]=90; // store 100 on index 4
       /* for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);

        }*/

        for (int number : numbers) {
            System.out.print(number+" ");
        }
    }
}
