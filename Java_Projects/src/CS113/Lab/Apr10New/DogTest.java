//Justin Ho

package CS113.Lab.Apr10New;

// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class DogTest
{
    public static void main(String[] args)
    {
        // Dog is abstract, cannot create instance of abstract classes.
        //Dog dog = new Dog("Spike");
        //System.out.println(dog.getName() + " says " + dog.speak());

        Yorkshire yorkshire = new Yorkshire("York");
        System.out.println(yorkshire.getName() + " says " + yorkshire.speak());

        Labrador labrador = new Labrador("Lab","black");
        System.out.println(labrador.getName() + " says " + labrador.speak());

        System.out.println(yorkshire.avgBreedWeight());
        System.out.println(labrador.avgBreedWeight());

    }
}