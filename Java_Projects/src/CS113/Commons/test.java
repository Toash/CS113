package CS113.Commons;

public class test {
    public static void main(String[] args) {

        boolean flag = false;
        int x;
        for(x=4; !flag; x-=1){
            if(x < 3){
                flag = true;
            }
        }
        System.out.println(x);
    }
}
