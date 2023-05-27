package class9Arrays;

public class E2ArraysInt {
    public static void main(String[] args) {
        /*
       create an array of int and store numbers from 30 40 50 90 inside it
       and access only the number 50
        */
        int[] numbers={30,-5,50,90};
        /*
        When we try to access an element using an index which does not exist
         */
        // System.out.println(numbers[20]);
        //ArrayIndexOutOfBoundsException
        // System.out.println(numbers[-5]); //negative index will not work
        System.out.println(numbers[2]);
    }
}
