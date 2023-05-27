package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        /*
        **For you to do:**
Write a program to input number "Input a number between 1-12" and when you input a number it should display the month using Scanner and Switch statement.
case: 1 will display January
case: 12 will display December
Anything outside of 12 will display "Invalid"
**Example Output:**
```
Input a number between 1-12
```
```
Invalid
```
**Example Output:**
```
Input a number between 1-12
```
```
January
```
         */
        System.out.println("Input a number between 1-12");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        switch(num){
            case 1:if(num==1){
                System.out.println("January");
            }
                break;
            case 2:if(num==2){
                System.out.println("February");
            }
            break;
            case 3:if(num==3){
                System.out.println("March");
            }
            break;
            case 4:if(num==4){
                System.out.println("April");
            }
                break;
            case 5:if(num==5){
                System.out.println("May");
            }
                break;
            case 6:if(num==6){
                System.out.println("June");
            }
                break;
            case 7:if(num==7){
                System.out.println("July");
            }
                break;
            case 8:if(num==8){
                System.out.println("August");
            }
                break;
            case 9:if(num==9){
                System.out.println("September");
            }
                break;
            case 10:if(num==10){
                System.out.println("October");
            }
                break;
            case 11:if(num==11){
                System.out.println("November");
            }
                break;
            case 12:if(num==12){
                System.out.println("December");
            }
                break;
            default:
                System.out.println("Invalid");

        }
    }
}
