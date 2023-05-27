package class10Arrays2D;

public class E5D2ArraysMatrix {
    public static void main(String[] args) {

        int[][]matrix={ //indicates 2DArrays
                {10, 20, 30, 40, 50},// 5 elements/but 4 indexes
                {20, 50, 65, 20},
                {102, 54, 60}
        };
        for(int i=0; i<matrix.length; i++){            //ROW
        // matrix[i(ROW)]=> will return the complete 1DArray at the index specified by the value of ROW
            int [] arr=matrix[i]; //indicates 1DArrays, => not needs this formula
            for(int j=0; j<matrix[i].length; j++){     //COLUMN
                System.out.print(matrix[i][j]+ " ");   //matrix[ROW][COLUMN]
            }
            System.out.println();
        }



    }
}
