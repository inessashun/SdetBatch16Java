package class18InheritanceParentChild;

public class TV {
    //Private members of the superclass are not allowed
    private int size;
    protected String make;
    String model;
}
class SamsungTV extends TV{

}
class TVTester{
    public static void main(String[] args) {
        SamsungTV sm=new SamsungTV();

    }
}
