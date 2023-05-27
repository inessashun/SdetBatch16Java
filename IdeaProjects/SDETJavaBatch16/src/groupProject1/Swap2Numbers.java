package groupProject1;

import java.util.Scanner;

/*
5. Write a program to swap 2 numbers WITHOUT a
temporary variable?
 */
public class Swap2Numbers {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);

        System.out.print(" Please Enter the First value : ");
        a = scan.nextInt();

        System.out.print(" Please Enter the Second value : ");
        b = scan.nextInt();

        System.out.println(" Before : a =  " + a + " and b =  " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" After :  a =  " + a + " and b =  " + b);
    }
}
