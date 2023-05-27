package class11Arrays2D;

public class E3D2ArrayString {
    public static void main(String[] args) {
        String[][] names2DArrays = {
                {"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Semir"}
        };
        for (String[] name1DArray: names2DArrays){
            for (String name: name1DArray){
                System.out.println(name);
            }
        }
    }
}
