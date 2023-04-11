package CS113.Homework.HW4;

// Justin Ho
public class Circle {
    private Point center;
    private int radius;

    public Point getCenter(){
        return this.center;
    }
    public int getRadius(){
        return this.radius;
    }
    public void setCenter(Point center){
        this.center = center;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

    // Constructor
    public Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }

    @Override
    public boolean equals(Object other){

        if (other instanceof Circle){
            Circle otherCircle = (Circle)other;
            if(otherCircle.radius == this.radius){
                return true;
            }
        }
        // Not comparing with a circle object or radii aren't equal.
        return false;
    }

    @Override
    public String toString(){
        return "Circle of radius " + this.radius + " and center " + this.center;
    }
    // Returns circumference
    public double circumference(){
        return this.radius * 2;
    }

}
