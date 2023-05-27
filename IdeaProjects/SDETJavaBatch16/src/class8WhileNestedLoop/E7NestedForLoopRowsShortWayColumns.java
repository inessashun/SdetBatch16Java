package class8WhileNestedLoop;

public class E7NestedForLoopRowsShortWayColumns {
    public static void main(String[] args) {
        //3 rows / 5 columns
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
