package ReplitTasks.ReplitTask;

public class Task68 {
    public static void main(String[] args) {
        /*
        **For you to do:**
        Write a program to print out the pattern:
         **Expected output:**
        ```
        $$$$
        ```
        ```
        $  $
        ```
        ```
        $  $
        ```
        ```
        $$$$
        ```
        */
        for(int i=0; i<=3; i++){
            System.out.print("$");
        }
        System.out.println();
        for(int j=0; j<=3; j+=3){
            System.out.print("$  ");
        }
        System.out.println();
        for(int e=0; e<=3; e+=3){
            System.out.print("$  ");
        }
        System.out.println();
        for(int f=0; f<=3; f++){
            System.out.print("$");
        }
    }
}
