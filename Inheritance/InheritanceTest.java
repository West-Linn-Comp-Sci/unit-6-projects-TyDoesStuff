
/**
 * Write a description of class InheritanceTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InheritanceTest
{
    public static void main(String[] args)
    {
        Limb limb = new Limb("Arm", 22.3);
        Finger pinky = new Finger("Pinky", 2.1, 3, 0.02);
        Thumb thumb = new Thumb(true, "Thumb", 2.2, 2, 0.02);
        
        limb.stretch();
        System.out.println(pinky);
        System.out.println(thumb.equals(pinky));
        thumb.stretch();
        System.out.println(pinky.getSegments());
    }
}
