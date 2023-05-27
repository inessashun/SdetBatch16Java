package class7WhileForLoop;

public class E10WhileLoopModulus3 {
    public static void main(String[] args) {
            //print numbers in one line 1 2 4 5 6 7 8 10 11 13 14 16 17 19 20
            // Hint modulus operator using a while loop
         int num=1; // %
         while(num<=20){

             if(num%3!=0) { //modulus 3
                 System.out.print(num + " ");
             }
             num++;
         }
    }
}
