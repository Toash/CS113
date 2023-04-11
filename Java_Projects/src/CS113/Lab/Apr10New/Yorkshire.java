//Justin Ho

package CS113.Lab.Apr10New;

// *****************************************************************
// Yorkshire.java
//
// A class derived from Dog that holds information about
// a Yorkshire terrier. Overrides Dog speak method.
//
// *****************************************************************
public class Yorkshire extends Dog
{
    private int breedWeight = 30;
    public Yorkshire(String name)
    {
        super(name);
    }
    // -------------------------------------------------------------
// Small bark -- overrides speak method in Dog
// -------------------------------------------------------------
    @Override
    public String speak()
    {
        return "woof";
    }
    @Override
    public int avgBreedWeight(){
        return this.breedWeight;
    }
}