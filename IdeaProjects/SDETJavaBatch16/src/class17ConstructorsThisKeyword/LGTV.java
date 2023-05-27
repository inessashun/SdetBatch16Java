package class17ConstructorsThisKeyword;

import class18InheritanceParentChild.TV;

public class LGTV extends TV {
    void printMake(){
        System.out.println(make);
    }
}
class LGTVTester{
    public static void main(String[] args) {
        LGTV lgtv=new LGTV();

    }
}
