package ReplitTasks.ReplitTask;

public class Task84 {
    public static void main(String[] args) {
        /*
        **For you to do:**
        Write a program that prints the total number of elements that are negative AND odd
        **Output:**
        for example -3 is both negative and odd
        ```
        3
        ```
         */
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        int num=0;

        for(int r=0; r<a.length; r++){
            for(int c=0; c<a[r].length; c++){

                if (a[r][c] % 2 == -1) {
                    num++;
                }

            }

        }
        System.out.println(num);

    }
}
