package CS113.ClassesAndObjects;

public class String_Object {
    //public static String test = "Test";
    public static String test = new String("Test");
    public static void main(String[] args) {
        System.out.println(test);
        String t = "t";

        String test_string = "This is a test string";
        String slice = test_string.substring(10);
        System.out.println(slice);
    }
}
