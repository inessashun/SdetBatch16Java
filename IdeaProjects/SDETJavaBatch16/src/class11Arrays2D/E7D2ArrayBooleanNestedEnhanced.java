package class11Arrays2D;
/*
Limitations of the Enhanced for loop:
    1) There is no index which means we will always get the data in the
    sequence it is present in the array
    2) we can't print the items in reverse order.
    3)we can't update the values as well.
 */
public class E7D2ArrayBooleanNestedEnhanced {
    public static void main(String[] args) {
        boolean[][] arr2D = {
                {true, false, true, true, false}, //lines=> horizontal is ROW, vertical is COLUMN
                {true, false, false,false,false}
        };
        //with the help of loop count how many times we have in above 2Darray
        int sum=0;
        for (int i=0; i<arr2D.length; i++){
            for(int j=0; j<arr2D[i].length; j++){
                if(arr2D[i][j]==true){
                    sum++;
                }
            }
        }
        System.out.println("sum = "+ sum);

        System.out.println("*** Second way of solution ****");

        int counter=0;
        for(boolean[]arr1D : arr2D){
            for(boolean bool : arr1D){

                if (bool) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
