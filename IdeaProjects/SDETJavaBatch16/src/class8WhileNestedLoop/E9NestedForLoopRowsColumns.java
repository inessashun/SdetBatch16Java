package class8WhileNestedLoop;

public class E9NestedForLoopRowsColumns {
    public static void main(String[] args) {

        for (int i=0; i<10; i++){ //10 rows
            for (int j=0; j<5; j++){ //5 columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
