package class8WhileNestedLoop;

public class E12NestedForLoopRowsColumns {
    public static void main(String[] args) {
        /* starting point =0
        ending point=4
        steps=+
        0  1  2  3  4
        0  1  2  3  4
        0  1  2  3  4
        0  1  2  3  4
        0  1  2  3  4
         */
        for (int i=0; i <5; i++) { //5 rows
            for (int j = 0; j <5; j++) { //5 columns
                System.out.print(j+"  ");
                //System.out.print(i+"  "); =>if we would print i , only 0000 will be executed
            }
            System.out.println();

        }
    }

}
