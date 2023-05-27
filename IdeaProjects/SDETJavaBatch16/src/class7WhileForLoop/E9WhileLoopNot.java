package class7WhileForLoop;

public class E9WhileLoopNot {
    public static void main(String[] args) {
            //print numbers in one line 25 20 10 5 using a while loop
            //Hint using if conditions
         int num=25;
         while(num>=5){
             if(num!=15) { //exclude 15
                 System.out.print(num + " ");
             }
             num-=5;
         }
    }
}
