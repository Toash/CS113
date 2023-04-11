package CS113.Commons;

public class EV {
    int range;
    String model;
    public EV(int range, String model){
        this.range = range;
        this.model = model;
    }
    public int getRange(){
        return this.range;
    }

    public String getModel(){
        return this.model;
    }
    public void setRange(int range){
        this.range = range;
    }
    public void setModel(String model){
        this.model = model;
    }

    @Override
    public String toString(){
        return model + " " + Integer.toString(range);
    }

    public int compareTo(EV other){
        if(this.range > other.range){
            return 1;
        } else if(this.range < other.range){
            return -1;
        }
        else{
            return 0;
        }
    }

    public boolean sameModel(EV other){
        if (other.model.equals(this.model)){
            return true;
        } else{
            return false;
        }
    }
}
