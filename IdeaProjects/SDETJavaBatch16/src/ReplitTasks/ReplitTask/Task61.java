package ReplitTasks.ReplitTask;

public class Task61 {
    public static void main(String[] args) {
       /*
       **For you to do:**
        Write a program that uses for loop to print multiplication of  number 3 from 1 to 10
        **Expected Output:**
        ```
        3*1=3
        ```
        ```
        3*2=6
        ```
        ```
        3*3=9
        ```
        ```
        3*4=12
        ```
        ```
        3*5=15
        ```
        ```
        3*6=18
        ```
        ```
        3*7=21
        ```
        ```
        3*8=24
        ```
        ```
        3*9=27
        ```
        ```
        3*10=30
        ```
         */
        int i=3;
        int j=1;
        for(j=1; j<=10; j++){
            System.out.println("3*"+j+"="+(i*j));
        }
    }
}
