package CS113.Commons;

public class Circle {

    public Circle(){
        this.radius = 0;
    }
    public Circle(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return this.radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

    private int radius;

    @Override
    public String toString(){
        return Integer.toString(this.radius);
    }

    public double area(){
        return (Math.PI* (this.radius * this.radius) );
    }

}
