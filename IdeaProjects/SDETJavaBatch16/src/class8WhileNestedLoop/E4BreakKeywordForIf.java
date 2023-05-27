package class8WhileNestedLoop;

public class E4BreakKeywordForIf {
    public static void main(String[] args) {
        System.out.println("*** The easiest way for Break ***");
        for(int i=0; i<30; i++){
            if(i>5){   //it's print until 5 anyway
                break; //will terminate loop after 5 iterations
                //without BREAK it's would print until 30 numbers/the end
                //BREAK use only inside IF conditions or SWITCH statement
            }
            System.out.println(i);
        }
        /*
        //1+2+3+4+5+6+7+8+9+10...24=300 -> 24 iterations
        int sum=0;
        for (int i=0; i<50; i++){
            sum=sum+i;
            if(sum>=300){
                System.out.println(i);
                break;
            }
        }*/
    }
}
