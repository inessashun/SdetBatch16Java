package class8WhileNestedLoop;

public class E14NestedForLoopRowsColumns {
    public static void main(String[] args) {
        /*
        1. First do second row - 123-123
        starting point =1
        ending point=3
        steps=+
        2.do first row 111-222
        starting point =1
        ending point=4
        steps=+
        1 1
        1 2
        1 3
        2 1
        2 2
        2 3
         */
        for (int i=1; i <3; i++) { //2 rows /rows 1,1,1 and 2,2,2
            for (int j = 1; j <4; j++) { //3+3 columns/twice 1,2,3 from inner loop
                 System.out.println(i +" "+ j );

            }
        }
    }
}
