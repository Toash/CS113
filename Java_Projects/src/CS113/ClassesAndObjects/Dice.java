package CS113.ClassesAndObjects;
public class Dice {
    private int faceValue;
    public Dice(){
        this.roll();
    }
    public Dice(int faceValue){
        try{
            if ( 1<=faceValue && faceValue<=6 ){
                this.faceValue = faceValue;
            }
            else{
                throw new Exception();
            }
        }catch (Exception a){
            System.out.println("Out of bound value");
        }
    }
    private static final int SIDES = 6;
    public int getFaceValue(){
        return this.faceValue;
    }
    @Override
    public String toString(){
        return "Dice with value " + faceValue;
    }

    // Dice will always have 6 faces
    public static int getFaces(){
        return Dice.SIDES;
    }

    public void roll(){
        this.faceValue = (int)(Math.random()*SIDES)+1;
        System.out.println("Rolling");
    }

}
