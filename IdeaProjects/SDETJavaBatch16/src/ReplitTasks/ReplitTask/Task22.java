package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your name");
        String name=scan.nextLine();

        System.out.println("Enter your mobile number");
        String num=scan.nextLine();

        System.out.println("Enter your age");
        int age=scan.nextInt();

        System.out.println("Your name is "+name+ ", your age is "+age+
                " and your mobile number is "+num);
    }

}
//submission LATE