//Justin Ho

package CS113.Homework.HW8;

public class MonetaryCoin extends Coin{
    //Value in cents (1-100 inclusive)
    private int monetaryValue;

    public int getMonetaryValue(){
        return this.monetaryValue;
    }

    public void setMonetaryValue(int monetaryValue)
    {
        this.monetaryValue = monetaryValue;
    }

    @Override
    public String toString(){
        return super.toString() + this.monetaryValue;
    }
}
