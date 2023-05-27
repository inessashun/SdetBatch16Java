package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task97 {
    public static void main(String[] args) {
       /*
    **For you to do:**
        Based on the user inputs program should give a correct answer.
        If browser is Chrome, Chrome, CHROME or ChRoMe it should print the:
        "Proceed with Chrome browser"
        If browser is Firefox, firefox, FIREFOX or FireFOX it should print the:
        "Proceed with Firefox browser"
        If browser is IE, ie, Ie or iE it should print the:
        "Proceed with IE browser"
        If any other browser it should print the:
        "Invalid browser"
     */
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();

        if(input.equalsIgnoreCase("CHROME")){
            System.out.println("Proceed with Chrome browser");
        }else if(input.equalsIgnoreCase("firefox")){
            System.out.println("Proceed with Firefox browser");
        } else if (input.equalsIgnoreCase("Ie")){
            System.out.println("Proceed with IE browser");
        }else{
            System.out.println("Invalid browser");
        }

    }
}
