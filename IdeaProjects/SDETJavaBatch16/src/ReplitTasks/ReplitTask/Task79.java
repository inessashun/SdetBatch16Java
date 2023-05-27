package ReplitTasks.ReplitTask;

public class Task79 {
    public static void main(String[] args) {
        /*
        **For you to do:**
        Write a program to print values from a 2D array
        **Example Output:**
        ```
        1.4 2.0 3.3 2.0
        ```
        ```
        4.0 1.5 6.1 1.0
        ```
        ```
        1.2 3.1 4.0 1.6
        ```
         */
        double [][] arr={
                {1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6}};
        double [] arr1=arr[0];

        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.println();
        arr1=arr[1];
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.println();
        arr1=arr[2];
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " ");
        }
    }
}
