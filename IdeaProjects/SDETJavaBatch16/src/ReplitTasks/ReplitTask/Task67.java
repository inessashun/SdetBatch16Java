package ReplitTasks.ReplitTask;

public class Task67 {
    public static void main(String[] args) {
        /*
        **For you to do:**
        Write a program to print out the pattern:
        1 2 3 4 5 6 7 8 9 10
        2 4 6 8 10 12 14 16 18 20
        3 6 9 12 15 18 21 24 27 30
        4 8 12 16 20 24 28 32 36 40
        5 10 15 20 25 30 35 40 45 50
         */
        for(int i=1; i<=10; i++){
        System.out.print(i+" ");
        }
        System.out.println();
        for(int j=2; j<=20; j+=2){
        System.out.print(j+" ");
        }
        System.out.println();
        for(int a=3; a<=30; a+=3){
        System.out.print(a+" ");
        }
        System.out.println();
        for(int b=4; b<=40; b+=4){
        System.out.print(b+" ");
        }
        System.out.println();
        for(int c=5; c<=50; c+=5){
        System.out.print(c+" ");
        }
    }
}
