//Justin Ho

package CS113.Lab.Apr10New;

// ****************************************************************
// Labrador.java
//
// A class derived from Dog that holds information about
// a labrador retriever. Overrides Dog speak method and includes
// information about avg weight for this breed.
//
// ****************************************************************
public class Labrador extends Dog
{
    private String color; //black, yellow, or chocolate?
    private int breedWeight = 75;
    public Labrador(String name, String color)
    {
        super(name);
        this.color = color;
    }
    // ------------------------------------------------------------
// Big bark -- overrides speak method in Dog
// ------------------------------------------------------------
    @Override
    public String speak()
    {
        return "WOOF";
    }
    // ------------------------------------------------------------
// Returns weight
// ------------------------------------------------------------
    @Override
    public int avgBreedWeight()
    {
        return this.breedWeight;
    }
}