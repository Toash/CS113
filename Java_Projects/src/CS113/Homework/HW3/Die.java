package CS113.Homework.HW3;
//Justin Ho
public class Die {
    private int faceValue;

    //Default constructor is a random dice
    public Die(){
        this.roll();
    }
    public Die(int faceValue){
        setFaceValue(faceValue);
    }
    private static final int SIDES = 6;

    public int getFaceValue(){
        return this.faceValue;
    }
    public void setFaceValue(int faceValue) {
        try{
            if ( 1<=faceValue && faceValue<=6 ){
                this.faceValue = faceValue;
            }
            else{
                throw new Exception();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public String toString(){
        return "Dice with value " + faceValue;
    }

    // All dice will always have 6 faces, so no need to get the max faces from a specific instance
    public static int getMaxFaces(){
        return Die.SIDES;
    }

    public void roll(){
        this.faceValue = (int)(Math.random()*SIDES)+1;
        System.out.println("Rolling");
    }

}
