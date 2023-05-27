package class8WhileNestedLoop;

public class E13NestedForLoopRowsColumns {
    public static void main(String[] args) {
        /* starting point =0
        ending point=3
        steps=+
        1 2 3 4 5
        2 3 4 5 6
        3 4 5 6 7
         */
        for (int i=0; i <3; i++) { //3 rows
            for (int j = 1; j <=5; j++) { //5 columns
                System.out.print(j+i+" ");
            }
            System.out.println();
        }
    }
}
