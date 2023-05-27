package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        /*
        Write a program to find the largest number among three
        distinct numbers using nested if condition
        Please use Scanner class to take input from users
        **Expected Output:**
        ```
        Please enter 3 distinct numbers 4 5  and 14
        ```
        ```
        The largest number is 14
        ```
         */
        //You need t take 3 inputs as numbers
        //int num1 = scanner.nextInt();
        //int num2 = scanner.nextInt();
        //int num3 = scanner.nextInt();
        //for string equality write
        //word1.equals(word2)
        //and in 2nd else if
        //!word1.equals(word2)

        System.out.println("Please enter 3 distinct numbers");
        Scanner scan=new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if(num1>num2){
            if(num2>num3){
                System.out.println("The largest number is "+num1);
            }else{
                System.out.println("The largest number is "+num3);
            }
        }else{
            if(num2>num3){
                System.out.println("The largest number is "+num2);
            }else{
                System.out.println("The largest number is "+num3);
            }
        }
    }
}
//I lost here :)