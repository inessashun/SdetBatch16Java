package groupProject1;
/*
7. Write a Java Program to print the first 10 numbers of
Fibonacci series.
 */
public class FibonacciSeries {
    public static void main(String[] args) {

        System.out.println("First 15 numbers of Fibonacci series:");

        int a, b, c;
        a=0;
        b=1;
        for(int i=1; i<=15; i++){
            c=a+b;
            System.out.print(a+" , ");
            a=b;
            b=c;
        }
    }
}
