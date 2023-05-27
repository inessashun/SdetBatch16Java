package class8WhileNestedLoop;

import java.util.Scanner;

public class E1WhileLoopStartEndStep {
    public static void main(String[] args) {
        //to print all the numbers from starting point to ending point
        //ask the user for starting and ending numbers

        /*
        System.out.print("*** No Scanner here ***");

        int start=15;
        int end=30;

        int number=start;

        while(number<=end){
            System.out.print(number+" "); //15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30
            number++;}
        */
        System.out.println("*** Scanner ***");

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the starting point, ending point and the step ");

        int start=scan.nextInt(); //Scanner start point
        int end=scan.nextInt();   //Scanner end point
        int step=scan.nextInt();  //Scanner step point

        int num=start;
        while(num<=end){
            System.out.print(num+" ");
            num=num+step; //or  print -> num+=step; //num++;
                 //example: start point 3, end point 21, step point 3
        }
        System.out.println();
        System.out.println("*** Other way ***");

        System.out.println("Please enter the starting point and ending point");
        int Start=scan.nextInt(); //Scanner start
        int End=scan.nextInt();   //Scanner end

        int counter=Start;

        while(counter<=End){
            System.out.print(counter+" ");
            counter++;
        }
    }
}
