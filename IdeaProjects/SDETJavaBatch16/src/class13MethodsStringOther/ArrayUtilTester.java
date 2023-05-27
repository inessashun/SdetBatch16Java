package class13MethodsStringOther;

public class ArrayUtilTester {
    public static void main(String[] args) {
        int[] arr={10, 20, 45, 89};
        int[] arr1={12, 32, 455, 889};

        int number=100;
        int number1=10;

        ArrayUtil obj=new ArrayUtil();
        obj.searchArray(arr,number);
        obj.searchArray(arr1,number);

        /*for(int i=0; i<arr.length; i++){
            if(arr[i]==number){
                System.out.println("Yes");
            }else{
                System.out.println("NO");
            }
        }*/

    }


}
