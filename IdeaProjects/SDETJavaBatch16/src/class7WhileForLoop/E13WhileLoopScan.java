package class7WhileForLoop;

import java.util.Scanner;

public class E13WhileLoopScan {
    public static void main(String[] args) {
        //ask the user for a number-> than print all the numbers from 1 to that number
        //create Scanner
        //create input number for printing
        //do while loop
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter any number greater than 1 ");
         int printNum=scan.nextInt();

         int num=1;
         while(num<=printNum) {
             System.out.print(num+ " ");
             num++;
         }
    }
}

