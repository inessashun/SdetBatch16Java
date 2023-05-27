package class11Arrays2D;

public class E1D2ArrayIntODD {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40, 50}, //lines=> horizontal is ROW, vertical is COLUMN
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        //print only ODD numbers from 2d array using Loop

        for(int row=0; row< arr.length; row++){
            for(int column=0; column<arr.length; column++){ //arr[i]=> gives me the array at specific index by i
                                                            //int[] innerArray=arr[i]; => innerArray.length
                //we can rename complicates formula with simple 1 word=> int element=arr[row][column];
                if(arr[row][column]%2!=0){                 //change with 1 word=> if(element%2!=0)
                    System.out.print(arr[row][column]+" ");// change with 1 word=> System.out.println(element);
                }

            }
        }
    }
}
