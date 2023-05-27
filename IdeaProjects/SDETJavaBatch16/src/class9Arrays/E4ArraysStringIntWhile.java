package class9Arrays;

public class E4ArraysStringIntWhile {
    public static void main(String[] args) {
        /*
        create array of String store 5 names in that array print all of the names
        from that array with the help of a for loop try printing with the help
        of a while loop as well
         */
        String [] names={"Apple","Banana", "Peach", "Berry", "Grapes"};
        for(int i=0; i<names.length; i++){
            System.out.print(names[i]+" ");
        }
        System.out.println();
        int counter=0;
        while (counter<names.length){
            System.out.print(names[counter]+" ");
            counter++;
        }
    }
}
