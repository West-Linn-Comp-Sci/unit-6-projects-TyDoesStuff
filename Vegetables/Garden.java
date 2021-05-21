import java.util.List;
import java.util.ArrayList;

public class Garden
{
    public static void main(String[] args)
    {
        List<Vegetable> garden = new ArrayList();
        garden.add(new Radish());
        garden.add(new Tomato());
        garden.add(new Carrot());
        
        for (Vegetable v : garden)
        {
            System.out.println(v.getName());
            System.out.println(v.getType());
            System.out.println(v.feed());
            System.out.println(v.water());
            System.out.println(v.harvest());
            System.out.println();
        }
    }
}
