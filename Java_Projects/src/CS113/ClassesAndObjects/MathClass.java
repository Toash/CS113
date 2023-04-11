package CS113.ClassesAndObjects;

import java.text.NumberFormat;

public class MathClass {
    public static void main(String[] args) {

        System.out.println(GetDigits(1000));
        System.out.println(Math.cos(Math.PI/2));
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println(fmt.format(1243.1234));
    }


    //Gets the amount of digits in a number
    public static int GetDigits(double number){
        double log10 = Math.log10(number) + 1 ;
        return (int)log10;
    }
}
