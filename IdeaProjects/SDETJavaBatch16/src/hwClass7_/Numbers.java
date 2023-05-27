package hwClass7_;

public class Numbers {
    public static void main(String[] args) {
        /*Print numbers from 1 to 100 in 1 line with space
Print numbers from 100 to 1
Print even numbers from 20 to 1 (2 ways)
Print odd numbers between 20 and 50 (2 ways)
         */
        int num=1;
        while(num<=100){
            System.out.print(num+" ");
            num++;
        }
        System.out.println("*****");
        int num1=100;
        while(num1>=1) {
            System.out.print(num + " ");
            num1--;
        }
        /*System.out.println("*****");
        int num2=20;
        while(num2>1) {
            System.out.print(num + " ");
            num2 -= 2;
        }
        System.out.println("*****");
        int num3=20;
        while(num3<50) {
            System.out.print(num + " ");
            num3 += 1;
        }*/
    }
}
