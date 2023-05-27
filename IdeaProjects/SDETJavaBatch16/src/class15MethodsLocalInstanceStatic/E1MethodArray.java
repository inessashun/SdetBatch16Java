package class15MethodsLocalInstanceStatic;

public class E1MethodArray {
    /*
    The createArray(size) method takes an integer parameter size and
   creates an array of that size. It then fills the array with the number
   10 using a for loop, and finally returns the array.
     createArray(5) => {10,10,10,10,10}
     createArray(3) => {10,10,10}
     */

    int [] createArray(int size){
        int [] arr= new int[size]; //size => is dynamic here, not specific number
        for (int i = 0; i < size; i++) {
            arr[i]=10;
        }
        return arr;

    }

    public static void main(String[] args) {
        E1MethodArray e1=new E1MethodArray();
        int[] array = e1.createArray(5);
        //System.out.println(Arrays.toString(array));    //to print without For Loop

        /*
        for (int i:array){                           //enhanced For Loop
            System.out.println(i);
        }
        */
        for (int i = 0; i <array.length ; i++) {     //nested For Loop
            System.out.println(array[i]);


        }
    }
}
