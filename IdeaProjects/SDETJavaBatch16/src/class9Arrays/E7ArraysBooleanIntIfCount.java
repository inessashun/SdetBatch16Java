package class9Arrays;

public class E7ArraysBooleanIntIfCount {
    public static void main(String[] args) {
        /*
        create an array store 10, 50, 60, 45, 100 then print elements
        which are present on odd indexes
        expected OUT  - 50, 45
         */
        boolean [] flags={true, false, true , false ,false, true };
        // write a loop to count how many values in above array are false
        int counter=0; //to count
        for(int i=0; i<flags.length; i++){ //for loop how many "false"
            if(flags[i]==false) { //other way=>  if(!flags[i]){
                counter++; //instead to print it, we count and print it out of code
            }
        }
        System.out.println(counter);

    }
}
