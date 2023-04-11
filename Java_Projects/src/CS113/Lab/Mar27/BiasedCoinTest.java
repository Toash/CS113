package CS113.Lab.Mar27;

public class BiasedCoinTest {
    public static void main(String[] args) {
        BiasedCoin coin1 = new BiasedCoin();

        int headCount = 0;
        int tailCount = 0;

        for(int i = 0; i<100; i++){
            if(coin1.getFace() == "HEADS"){
                headCount+=1;
            } else{
                tailCount+=1;
            }
            coin1.flip();
        }

        System.out.println(headCount);
        System.out.println(tailCount);

    }
}
