package groupProject1;
/*
4. Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array.
 */
public class SumEvenAndOdd {
    public static void main(String[] args) {
        int [][] arr={
                {4, 9, 6},
                {19, 22, 26 }
        };
        int sum1 = 0;
        for(int [] arr1: arr){
            for(int num: arr1){
                if(num%2==0) {
                    sum1 = sum1 + num;
                }
            }
        }
        System.out.print(" Sum of Even =" + sum1);
        System.out.println();
        int sum2 = 0;
        for(int [] arr1: arr){
            for(int numb: arr1){
                if(numb%2==1) {
                    sum2 = sum2 + numb;
                }
            }
        }
        System.out.print(" Sum of Odd =" +sum2);
    }
}
