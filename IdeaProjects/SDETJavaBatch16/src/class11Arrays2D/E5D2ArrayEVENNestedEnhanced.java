package class11Arrays2D;
/*
Limitations of the Enhanced for loop:
    1) There is no index which means we will always get the data in the
    sequence it is present in the array
    2) we can't print the items in reverse order.
    3)we can't update the values as well.
 */
public class E5D2ArrayEVENNestedEnhanced {
    public static void main(String[] args) {
        int[][] arr2D = {
                {10, 20, 30, 40, 50}, //lines=> horizontal is ROW, vertical is COLUMN
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };//to print EVEN elements
        //with the help of loop count many numbers in above array are EVEN
        int counter=0;
        for (int[] arr1D:arr2D ){
            for(int num: arr1D){
                if(num%2==0){
                    counter++;
                }

                System.out.println("counter = "+ counter);
            }
        }
    }
}
