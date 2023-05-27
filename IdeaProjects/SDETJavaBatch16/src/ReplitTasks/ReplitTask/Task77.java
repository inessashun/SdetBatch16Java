package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task77 {
    public static void main(String[] args) {
        /*
        **For you to do:**
        Create an array of integers that will store 5 elements taken from a user
        Don't print any prompt message for the user
        Then print out all the elements you have created in the first loop in reverse order.
        **Example:**
        ```
        Input:
        ```
        ```
        1
        ```
        ```
        2
        ```
        ```
        3
        ```
        ```
        4
        ```
        ```
        5
        ```
        ```
        Output:
        ```
        ```
        5
        ```
        ```
        4
        ```
        ```
        3
        ```
        ```
        2
        ```
        ```
        1
        ```
         */
        Scanner scan=new Scanner(System.in);

        int input=scan.nextInt();

        int [] numbers= {input};

        for(int i=0;i<numbers.length;  i--) {

            System.out.println(numbers[i]+" ");
        }

    }
}
