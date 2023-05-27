package ReplitTasks.ReplitTask;

public class Task85 {
    public static void main(String[] args) {
        /*
        **For you to do:**
        Write a program that sums all numbers that are on even index and on even row.
        **Expected Output:**
        ```
        -4
        ```
         */
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        int num=0;

        for(int i=0; i<a.length; i++){
            if(i%2==0){
                for(int j=0; j<a[i].length; j++){
                    if(j%2==0){
                        num+=a[i][j];
                    }
                }
            }
        }
        System.out.println(num);
    }
}
