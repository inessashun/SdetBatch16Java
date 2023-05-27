package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) {
        /*
        Given the following inputs:
        ```
        int x;
        ```
        Write a for loop that will print out a series of numbers starting
        at 0 and ending at the x(value must be taken from a user), exclusive.
        **Example Output:**
        ```
        In: 3
        ```
        ```
        0 1 2
        ```
        ```
        In: 8
        ```
        ```
        0 1 2 3 4 5 6 7
        ```
        ```
        In: 5
        ```
        ```
        0 1 2 3 4
        ```
         */
        System.out.print("In: " );
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();

        for(int x=0; x<i; x++){
            System.out.print(x+" ");
        }
    }
}
