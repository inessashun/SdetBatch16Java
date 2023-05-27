package hwClass6;

import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
     /*
     4.) Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.

      */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your Birth month");
        String BirthMonth=scan.nextLine();


        if(BirthMonth.equals("March , April, May")){
            System.out.println("season =Spring");

        }else if(BirthMonth.equals(" June, July, August")){
            System.out.println("season Summer");

        }else if(BirthMonth.equals("September, October, November")){
            System.out.println("season Fall");

        }else if(BirthMonth.equals("December, January, February")){
            System.out.println("season Winter");
        }
        System.out.println("You were born in a season" );

    }
}
