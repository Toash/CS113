package CS113.Lab;

public class StringPlay {

    public static void main(String[] args) {
        String test = new String("Test string");

        //method of string class instance
        System.out.println(test.length());

        //Pointer to a string
        String test1;

        test1 = "testing";
        System.out.println(test1);
        test1 = test1.toUpperCase();
        System.out.println(test1);

        String abc = "abc";
        System.out.println(abc);
        abc = abc.replace('a','b');
        System.out.println(abc);

        String test2 = "This is a bbbbb string";
        System.out.println(test2);
        test2 = test2.replace("b","test");
        System.out.println(test2);

        abc = "abc";
        abc = abc.concat("def");
        System.out.println(abc);

        System.out.println(test2);
        test2 = test2.replace("test","*");
        System.out.println(test2);
    }
}
