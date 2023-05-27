package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task100 {
    public static void main(String[] args) {
        /*
    Given the following inputs:
    ```
    String s;
    ```
    Write a for loop that will print out the reverse of the string.
    Sample input/outputs:
    ```
    In: manhattan
    ```
    ```
    nattahnam
    ```
    ```
    In: processor
    ```
    ```
    rossecorp
    ```
    ```
    In: racecar
    ```
    ```
    racecar
    ```
    */
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        s.toLowerCase();

        StringBuilder s2=new StringBuilder(s);
        s2.reverse();
        System.out.println("In:"+s2);

    }
}
