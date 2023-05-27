package class7WhileForLoop;

public class E11WhileLoopEvenOdd {
    public static void main(String[] args) {
            //print numbers from 100 to 1
            //print even numbers from 20 to 100
            //print odd numbers from 100 to 1
         int num=100;
         while(num>0){ //same as writing num>=1
               System.out.print(num + " ");
                num--;
             }
         System.out.println();
         System.out.println("----EVEN-----");
            //assigning a new value to the counter for next loop
         num=20;
         System.out.println();
         while(num<=100){
             System.out.print(num + " ");
             num+=2;
         }
         System.out.println();
         System.out.println("----ODD-----");

         num=100;
        // so that we can see the next output on a new line
         System.out.println();
         while(num>=1) {
             // odd numbers when divided by 2 gives 1 as remainder
             if (num % 2 == 1){ // its as counter%2!=0
                 System.out.print(num + " ");
            }
            num--;

         }
    }
}

