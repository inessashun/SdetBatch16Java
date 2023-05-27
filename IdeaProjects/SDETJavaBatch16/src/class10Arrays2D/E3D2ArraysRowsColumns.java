package class10Arrays2D;

public class E3D2ArraysRowsColumns {
    public static void main(String[] args) {
        int[][]matrix={
                {10, 20, 30}, //first 1 D Arrays in 2 D Arrays Table
                {20, 50, 65}, //second 1 D Arrays in 2 D Arrays Table
                {102, 54, 60} //third 1 D Arrays
        };
        int [] arr1=matrix[0];//=> [0]-1st; [1]-2nd; [2]-3rd 1 D Arrays line
        //we ask to print info in 1D array int from 2D array all numbers from 0 row.
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " ");
        }
        //to print other Rows we have to copy-paste code, everytime just change the Row index
        System.out.println();
        arr1=matrix[1]; //we cannot create duplicate variable again, no int here
        //to know - matrix 1 => Row 3 from 2D array
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.println();
        arr1=matrix[2];
        //to know - matrix 2 => Row 3 from 2D array
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " ");
        }

    }
}
