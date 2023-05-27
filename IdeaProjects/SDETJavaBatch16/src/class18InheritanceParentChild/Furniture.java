package class18InheritanceParentChild;

public class Furniture {
    String color="Black";
}
class Chair extends Furniture{

    String color="White"; //if something present in your method it will be printed
    void printColor(){

        String color="Blue";
        System.out.println(color);
                    //with => println(color) = Blue printed ////local preference
                    //with => println(this.color) = White printed //instance preference of same classes
                    //with => println(super.color) = Black printed //instance preference of parent classes
    }
}
class FurnitureTester{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();

    }
}
