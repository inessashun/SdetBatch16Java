package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task76 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String nextDay = scan.nextLine();
        int[]day={1,2,3,4,5,6,7};

        int i = 0;
        while (i < 7) {
            i++;
        }
        String [] names={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for(String name: names){
            System.out.println(name);
        }

    }
}
//Replit Passed first version of code
/*
Scanner scan = new Scanner(System.in);
        System.out.println("Please enter day 1 of the week");
        String days = scan.nextLine();

        int[] numbers = {2, 3, 4, 5, 6, 7};

        int i = 0;
        while (i < 7) {
            System.out.println("Please enter day " + numbers[i] + " of the week");
            i++;

            String nextDay = scan.nextLine();
        }
 */