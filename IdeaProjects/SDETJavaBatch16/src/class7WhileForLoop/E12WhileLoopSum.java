package class7WhileForLoop;

public class E12WhileLoopSum {
    public static void main(String[] args) {
        //add all the numbers from 1 to 10 and display the result 55
        //first write a loop that goes from 1 to 10
        //create a variable to hold the sum and add all the numbers
        //to that variable in each iteration
         int num=1;
         int sum=0;
         while(num<=10) {
             sum=sum+num; //same as sum+=num;
             num++;
         }
         System.out.print(sum);
    }
}

