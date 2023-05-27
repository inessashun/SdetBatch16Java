package class8WhileNestedLoop;

public class E11NestedWhileForLoopRowsColumns {
    public static void main(String[] args) {
        /* starting point =2
        ending point=10
        steps=2
        2 4 6 8 10
        2 4 6 8 10
        2 4 6 8 10
        2 4 6 8 10
        2 4 6 8 10
         */ //two different way to code
        for (int i=2; i <=10; i+=2) { //5 rows
            for (int j = 2; j <= 10; j+=2) { //5 columns
                System.out.print(j+"  ");
            }
            System.out.println();
        }
        System.out.println("*** other way ****");
        //other way
        int counter=0;
        while(counter<4){
            for (int i=2; i<=10; i=i+2){
                System.out.print(i+" ");
            }
            System.out.println();
            counter++;
        }
    }

}
