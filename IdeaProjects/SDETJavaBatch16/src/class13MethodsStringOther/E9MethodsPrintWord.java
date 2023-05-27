package class13MethodsStringOther;

public class E9MethodsPrintWord {
    void printSomething(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");

    }
    void printWord(String word){
        System.out.println(word);//you can print different words on Tester
        System.out.println(word);
        System.out.println(word);

    }
    void printWordManyTimes(String word, int number){
        for(int i=0; i<number; i++){
            System.out.println(word);
        }
    }
}
