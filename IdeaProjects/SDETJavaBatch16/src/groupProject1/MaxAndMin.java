package groupProject1;
/*
8. Maximum and minimum number in the array.
 */
public class MaxAndMin {
    public static void main(String[] args) {

        int[]array= {4, 9, 6, 19, 22, 26};
        int maxNum=array[0];
        int minNum=array[0];

        for(int i=0; i<array.length; i++){
            if(maxNum< array[i]){
                maxNum=array[i];
            }else{
                if(minNum< array[i]){
                    minNum=array[i];
                }
            }
        }
        System.out.println("Maximum Number is = "+maxNum);
        System.out.println("Minimum Number is = "+minNum);
    }
}
