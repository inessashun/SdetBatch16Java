package class24;

import class18InheritanceParentChild.A;

import java.util.ArrayList;

public class E3ArrayList{
    public static void main(String[] args) {
        ArrayList<Character> character=new ArrayList<>();
        character.add('D');
        character.add('E');
        character.add('W');
        System.out.println(character);
        System.out.println(character.indexOf('E'));
        System.out.println(character.contains('W'));
        System.out.println(character.isEmpty());
        System.out.println(character.set(1,'H')); //to replace 'E' with 'H'
        System.out.println(character);

    }
}
