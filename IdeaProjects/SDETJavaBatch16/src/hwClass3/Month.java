package hwClass3;
        /*4)Create a Java program and declare int variable that will hold a month.
        Based on the value of the variable your program should print the name of the month.
        Write a program to check whether number is positive or negative.
        Write a Java Program to check whether number is Even or Odd.*/
public class Month {
    public static void main(String[] args) {
        int month=3;

        if(month==3){
            System.out.println("March");

            int number=3;
            if(number>0){
                System.out.println("Positive");
            }
            else{
                System.out.println("Negative");
            }

            int num=4;
            int remainder=num%2;
            if(remainder==0){
                System.out.println("Number is Even");
            }
            else{
                System.out.println("Number is Odd");
            }

        }
    }
}
