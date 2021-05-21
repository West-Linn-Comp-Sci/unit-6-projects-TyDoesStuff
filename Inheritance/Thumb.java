
/**
 * Write a description of class Thumb here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Thumb extends Finger
{
    boolean hyperflexible;
    
    public Thumb(boolean hyperflexible, String name, double length, int segments, double nailExtendLength)
    {
        super(name, length, segments, nailExtendLength);
        this.hyperflexible = hyperflexible;
    }
    
    @Override
    public void stretch()
    {
        if (hyperflexible)
        {
            System.out.println("Hyperextended " + name + "!");
        }
        else
        {
            super.stretch();
        }
    }
    
    public boolean getHyperflexible()
    {
        return hyperflexible;
    }
    
    public void setHyperflexible(boolean hyperflexible)
    {
        this.hyperflexible = hyperflexible;
    }
    
    public String toString()
    {
        String isnt = "isn't";
        if (hyperflexible)
            isnt = "is";
        return super.toString() + " and " + isnt + " hyperflexible";
    }
    
    public boolean equals(Thumb thumb)
    {
        return name.equals(thumb.getName())
            && length == thumb.getLength()
            && segments == thumb.getSegments()
            && nailExtendLength == thumb.getNailExtendLength()
            && hyperflexible == thumb.getHyperflexible();
    }
}
