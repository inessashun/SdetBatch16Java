package class13MethodsStringOther;

public class ArrayUtil {
    void searchArray(int[] arr, int number){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==number){
                System.out.println("Number is in the array");
                break;
            }else{
                System.out.println("Number is not in the array");
            }
        }
    }
}




