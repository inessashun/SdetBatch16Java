package class18InheritanceParentChild;

public class D {
    static void print(){
        System.out.println("Hello");
    }
}
class E extends D{

}
class ETester{  //Tester of Class E
    public static void main(String[] args) {
        E.print();
    }
}
