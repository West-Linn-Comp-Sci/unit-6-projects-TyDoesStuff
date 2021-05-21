
/**
 * Write a description of class Finger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Finger extends Limb
{
    int segments;
    double nailExtendLength;
    
    public Finger(String name, double length, int segments, double nailExtendLength)
    {
        super(name, length);
        this.segments = segments;
        this.nailExtendLength = nailExtendLength;
    }
    
    @Override
    public double getLength()
    {
        return super.getLength() + nailExtendLength;
    }
    
    public int getSegments()
    {
        return segments;
    }
    
    public double getNailExtendLength()
    {
        return nailExtendLength;
    }
    
    public void setSegments(int segments)
    {
        this.segments = segments;
    }
    
    public void setNailExtendLength(double nailExtendLength)
    {
        this.nailExtendLength = nailExtendLength;
    }
    
    public String toString()
    {
        return super.toString() + " and has " + segments 
            + " segments with a nail length of " + nailExtendLength;
    }
    
    public boolean equals(Finger finger)
    {
        return name.equals(finger.getName())
            && length == finger.getLength()
            && segments == finger.getSegments()
            && nailExtendLength == finger.getNailExtendLength();
    }
}
