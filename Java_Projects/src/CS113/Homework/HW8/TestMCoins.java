// Justin Ho

package CS113.Homework.HW8;
import java.util.Random;

public class TestMCoins {
    public static void main(String[] args) {
        Random random = new Random();

        MonetaryCoin[][] monetaryCoins = new MonetaryCoin[3][10];

        // Initialize the array
        for(int i=0; i< monetaryCoins.length;i++){
            for(int j=0; j< monetaryCoins[0].length;j++){
                MonetaryCoin mCoin = new MonetaryCoin();

                // Randomizing every coin
                mCoin.flip();
                mCoin.setMonetaryValue(random.nextInt(1,101));

                monetaryCoins[i][j] = mCoin;
            }
        }

        int[] mValOfHeads = new int[3];

        for(int i=0; i< monetaryCoins.length; i++){

            //Compute total val in row
            int mValOfHeadsInCurrentRow = 0;
            for(int j=0; j<monetaryCoins[0].length;j++){

                MonetaryCoin currentCoin = monetaryCoins[i][j];

                if(currentCoin.isHeads()){
                    mValOfHeadsInCurrentRow += currentCoin.getMonetaryValue();
                }
            }
            //Done with row
            mValOfHeads[i] = mValOfHeadsInCurrentRow;
        }
        System.out.println(mValOfHeads[0] + ", "+ mValOfHeads[1] + ", " + mValOfHeads[2]);
    }
}
