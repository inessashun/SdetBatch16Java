package class10Arrays2D;

public class Task4EnhancedForWhileLoop {
    public static void main(String[] args) {
        /*
        4) Create an array of cars and store 6 elements into it.
        Using 3 different loops print all values from the array.
         */
        // 1st way of creating loops an array
        String [] cars={"Toyota", "BMW"," RR", "Honda", "Lexus", "Ford"};
        for(String car: cars) {             //Enhanced For Loop
            System.out.print(car+" ");
        }
        System.out.println();
        // 2nd way of creating loops an array
        for(int i=0; i<cars.length; i++){  //Normal index For Loop (complex manipulation)
            System.out.print(cars[i]+" ");
        }
        System.out.println();
        // 3rd way of creating loops an array to access one by one
        int i=0;
        while(i<cars.length){               //While Loop
            System.out.print(cars[i]+" ");
            i++;
        }
    }
}
