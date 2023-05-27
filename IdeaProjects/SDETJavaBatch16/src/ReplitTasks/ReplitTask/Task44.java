package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {
        /*
        **For you to do:**
        Prompt user with questions: "Please enter your favorite car make"
        - if user enters  BMW -->  carOrigin = "german car"
        - if user enters  Toyota -->  carOrigin = " japanese car"
        - if user enters  Maserati -->  carOrigin = "italian car"
        - anything else besides those values --> carOrigin = "unknown"
        ```
        The output of your program should be:
        ```
        ```
        "Your favorite car is ___"
        ```
         */
        System.out.println("Please enter your favorite car make");
        Scanner scan=new Scanner(System.in);
        String car=scan.nextLine();

        switch(car){
            case "BMW":
                System.out.println("Your favorite car is german car");
                break;
            case "Toyota":
                System.out.println("Your favorite car is japanese car");
                break;
            case "Maserati":
                System.out.println("Your favorite car is italian car");
                break;
            default:
                System.out.println("Your favorite car is unknown");

        }
    }

}
//Replit  Passed & submitted