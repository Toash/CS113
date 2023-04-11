package CS113.Homework.HW3;

//Justin Ho
public class MyMethods {
    //Returns volume
    public int volume(int width, int length, int height){
        return (width*length*height);
    }

    // Returns average face value of two dice objects
    public double avgFaceValues(Die die1, Die die2){
        return (die1.getFaceValue() + die2.getFaceValue()) / 2.0;
    }
}
