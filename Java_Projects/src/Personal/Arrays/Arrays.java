package Personal.Arrays;

import CS113.Homework.HW3.Die;

public class Arrays {
    public static void main(String[] args) {
        Die[] dieArray = {new Die(1), new Die(2)};

        for(Die die : dieArray){
            System.out.println(die.getFaceValue());
        }
    }
}
