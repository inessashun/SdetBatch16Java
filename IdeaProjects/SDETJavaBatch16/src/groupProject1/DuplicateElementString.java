package groupProject1;
/*
10. Write a program to print out duplicate elements from
an Array of Strings
 */
public class DuplicateElementString {
    public static void main(String[] args) {
        String[] names= {"Apple","Banana", "Peach", "Berry", "Grapes", "Apple"};

        for(int i=0; i<names.length; i++){
            for(int j=i+1; j<names.length; j++){
                if(names[i].equals(names[j])){
                    System.out.println("The duplicate elements is "+names[j]);
                }
            }
        }
    }
}
