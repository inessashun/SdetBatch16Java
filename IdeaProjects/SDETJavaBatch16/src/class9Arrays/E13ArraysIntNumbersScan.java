package class9Arrays;

import java.util.Scanner;

public class E13ArraysIntNumbersScan {
    public static void main(String[] args) {

        int [] numbers=new int [3]; //user input numbers 3 times
        Scanner scan=new Scanner(System.in);

        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Please enter numbers");
            numbers[i]=scan.nextInt();

        }
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
