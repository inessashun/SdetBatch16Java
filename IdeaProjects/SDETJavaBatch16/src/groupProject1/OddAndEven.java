package groupProject1;
/*
3. Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.
 */
public class OddAndEven {
    public static void main(String[] args) {
        int [][] arr={
                {4, 9, 6},
                {19, 22, 26 }
        };

            for(int [] arr1: arr){
                for(int num: arr1){
                    if(num%2==0) {
                        System.out.print(" Even " + num);
                    }
                }

            }
            System.out.println();

            for(int [] arr1: arr){
                for(int numb: arr1){
                    if(numb%2==1) {
                        System.out.print(" Odd " +numb);
                    }
                }
            }

    }
}
