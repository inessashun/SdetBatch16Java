package class9Arrays;

public class E12ArraysIntIncreasedNum2Ways {
    public static void main(String[] args) {
        /*
        There are two ways of creating arrays
        new int[5] => create an array of int with size 5
         */
        int [] numbers=new int [5];
        int num=50;

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=num;
            num=num+10;

        }
        for (int number : numbers) {
            System.out.println(number);
        }


    }
}
