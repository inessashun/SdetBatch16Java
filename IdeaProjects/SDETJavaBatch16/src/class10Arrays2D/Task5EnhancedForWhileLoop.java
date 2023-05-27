package class10Arrays2D;

public class Task5EnhancedForWhileLoop {
    public static void main(String[] args) {
        /*
        5) Create an array of animals and store 5 elements into it.
        Using 2 different loops print all elements from the array.
         */
        // 1st way of creating loops an array
        String[]animals={"Dog", "Cat", "Lion", "Tiger", "Cow"};
        for (String animal: animals){           //Enhanced For Loop
            System.out.print(animal+" ");
        }
        System.out.println();
        // 2nd way of creating loops an array
        for(int i=0; i< animals.length; i++){   //Normal index For Loop (complex manipulation)
            System.out.print(animals[i]+" ");
        }
        System.out.println();
        // 3rd way of creating loops an array
        int i=0;
        while (i<animals.length){               //While Loop
            System.out.print(animals[i]+" ");
            i++;
        }
    }
}
