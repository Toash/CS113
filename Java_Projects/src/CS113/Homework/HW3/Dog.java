package CS113.Homework.HW3;

// Justin Ho
public class Dog {
    private String name;
    private double weight; //in pounds

    public Dog(){
        this.name = "dog";
        this.weight = 0;
    }

    public String getName(){
        return this.name;
    }
    public double getWeight(){
        return this.weight;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    //Returns weight of dog in kgs.
    public double toKgs(){
        return this.weight * 0.453592;
    }

    @Override
    public String toString(){
        return "Dog object with name " + this.name + " and weight " + this.weight;
    }


}
