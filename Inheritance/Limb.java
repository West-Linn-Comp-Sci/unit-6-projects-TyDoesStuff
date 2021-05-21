
/**
 * Write a description of class Finger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Limb
{
    String name;
    double length;
    
    public Limb(String name, double length)
    {
        this.name = name;
        this.length = length;
    }
    
    public void stretch()
    {
        System.out.println("Extended " + name + "!");
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void SetLength(double length)
    {
        this.length = length;
    }
    
    public String toString()
    {
        return name + " has length " + length;
    }
}
