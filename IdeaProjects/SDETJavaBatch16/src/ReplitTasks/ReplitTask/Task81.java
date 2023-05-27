package ReplitTasks.ReplitTask;

public class Task81 {
    public static void main(String[] args) {
        /*
        **For you to do:**
        Write a program that prints the highest value in the array.
        **Expected Output:**
        input [5,4,8]
        ```
        8
        ```
         */
        int[] arr= {5, 4, 8};

        int largest=arr[1];
        for(int num:arr){
            if(num>largest){
                largest=num;
            }
        }
        System.out.println(largest);

    }
}
