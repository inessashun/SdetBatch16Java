package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        /*
        **For you to do:**
        Write a program to take values of length and width from the user.
        Based on value define whether the shape is a square or rectangle.
        Examples:
        ```
        Please enter the length 18
        Please enter the width 16
        The shape of your object is rectangle
        ```
        ```
        Please enter the length 16
        Please enter the width 16
        The shape of your object is square
        ```
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the length ");
        int num1=scan.nextInt();
        System.out.println("Please enter the width ");
        int num2=scan.nextInt();
        if(num1==18 && num2==16){
            System.out.println("The shape of your object is rectangle ");
        }else {
            System.out.println("The shape of your object is square ");
        }
    }
}
