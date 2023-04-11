package CS113.ClassesAndObjects;


public class WrapperClasses {
    public static void main(String[] args) {
        Integer integer_wrapper = Integer.valueOf(40);
        System.out.println(integer_wrapper);

        String test = "23412";

        System.out.println(Integer.parseInt(test));
        System.out.println(Integer.valueOf(test));
    }
}
