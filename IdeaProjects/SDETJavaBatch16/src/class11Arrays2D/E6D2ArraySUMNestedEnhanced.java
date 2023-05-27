package class11Arrays2D;
/*
Limitations of the Enhanced for loop:
    1) There is no index which means we will always get the data in the
    sequence it is present in the array
    2) we can't print the items in reverse order.
    3)we can't update the values as well.
 */
public class E6D2ArraySUMNestedEnhanced {
    public static void main(String[] args) {
        int[][] arr2D = {
                {10, 20, 30, 40, 50}, //lines=> horizontal is ROW, vertical is COLUMN
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        //with the help of loop you can to add all the elements for each row and print their SUM

        for (int[] arr1D:arr2D ){
            int sum=0; // for reset sum to 0 after first row of code of arr1D loop
            for(int num: arr1D) {
                sum = sum + num;
            }
            System.out.println("sum = "+ sum);

        }
    }
}
