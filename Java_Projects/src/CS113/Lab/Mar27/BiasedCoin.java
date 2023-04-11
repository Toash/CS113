package CS113.Lab.Mar27;
import java.util.Random;

public class BiasedCoin {

    private double bias; // Probabilty of heads, between 0 and 1 inclusive
    private String face; // The side of the coin that's facing up
    private Random random;

    public BiasedCoin(){
        this.bias = 0.5;
        this.flip();
    }

    public BiasedCoin(double bias){

        if(bias <= 0 && bias >= 1){
            this.bias = bias;
        }else {
            this.bias = 0.5;
        }

        this.flip();

    }

    public void flip(){
        random = new Random();
        double flipNum = random.nextDouble();

        if(flipNum < bias){
            this.face = "HEADS";
        } else{
            this.face = "TAILS";
        }
    }

    public String getFace(){
        return this.face;
    }

}
