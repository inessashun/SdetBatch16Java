package groupProject1;
/*
9. Write a java program to find the second largest
number in the array
 */
public class SecondLargest {
    public static void main(String[] args) {
        int num, size;
        int[]arr={4, 9, 6, 19, 22, 26};
        size=arr.length;

        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i]>arr[j]){
                    num=arr[i];
                    arr[i]=arr[j];
                    arr[j]=num;
                }
            }
        }
        System.out.println("2nd Largest Number is "+arr[size-2]);

    }
}
