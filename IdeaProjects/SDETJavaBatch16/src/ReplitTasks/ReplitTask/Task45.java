package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) {
        /*
        **For you to do:**
        Ask the user to enter any number from 1-7.
        Based on the number define the day of the week
        **Example Output:**
        ```
        Input a number between 1-7
        ```
        ```
        Friday
        ```
        **Example Output:**
        ```
        Input a number between 1-7
        ```
        ```
        Invalid
        ```
         */
        System.out.println("Input a number between 1-7");
        Scanner scan=new Scanner(System.in);
        int day=scan.nextInt();
        switch(day){
            case 1: if(day==1){
                System.out.println("Monday");
            }
                break;
            case 2: if(day==2){
                System.out.println("Tuesday");
            }
                break;
            case 3: if(day==3){
                System.out.println("Wednesday");
            }
                break;
            case 4: if(day==4){
                System.out.println("Thursday");
            }
                break;
            case 5: if(day==5){
                System.out.println("Friday");
            }
                break;
            case 6: if(day==6){
                System.out.println("Saturday");
            }
                break;
            case 7: if(day==7){
                System.out.println("Sunday");
            }
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
