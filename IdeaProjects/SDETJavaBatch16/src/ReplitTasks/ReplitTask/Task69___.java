package ReplitTasks.ReplitTask;

public class Task69___ {
    public static void main(String[] args) {
       /*
       **For you to do:**
Write a program to print out the pattern:
*Expected output:**
```
1 2 3 4 5 6 7
```
```
1 2 3 4 5 6
```
```
1 2 3 4 5
```
```
1 2 3 4
```
```
1 2 3
```
```
1 2
```
```
1
```
```
1 2
```
```
1 2 3
```
```
1 2 3 4
```
```
1 2 3 4 5
```
```
1 2 3 4 5 6
```
```
1 2 3 4 5 6 7
```
        */
        for(int i=0; i<=13; i++){
            for(int j=1; j<=7; j++){
                System.out.print(j+i);
            }
            System.out.println();
        }


    }
}
