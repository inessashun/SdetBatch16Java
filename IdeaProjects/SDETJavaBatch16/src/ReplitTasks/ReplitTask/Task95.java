package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task95 {
    public static void main(String[] args) {
        /*
        **For you to do:**
        Using Scanner class input string value.
        Print out the following: "The first 3 letters of \_\_\_ is ___"
        ```
        For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
        ```
         */
        Scanner scan=new Scanner(System.in);
        String input=scan.next();
        System.out.println("The first 3 letters of "+input +" is "+(input.substring(0,3)));


    }
}
