package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        /*
        **For you to do:**

        Prompt user with a question: "Is it weekend?"

        If it is not a weekend --> subject="manual testing"

        Otherwise --> subject="Java"

        **Output**:

        ```
        Today you will be learning ____
        ```
         */

        System.out.println("Is it weekend?");
        Scanner scan=new Scanner(System.in);
        boolean day=scan.nextBoolean();
        if(day==true){
            System.out.println("Today you will be learning Java");
        }else{
            System.out.println("Today you will be learning manual testing");
        }

    }
}
