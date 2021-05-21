public class Radish extends Vegetable
{
    public Radish()
    {
        super("Radish", "Root");
        setInstructions(
              "Sow seeds into soil with at least 3\" of space\n"
            + "Water to keep radish beds moist\n"
            + "Harvest when roots are 1 inch in diameter"
        );
    }
    
    public String feed()
    {
        return "Work some all-purpose fertiziler into the soil before planting.";
    }
    
    public String water()
    {
        return "Water radish beds consistently to maintain moistness.";
    }
    
    public String harvest()
    {
        return "Harvest when the root is rougly the size of a quarter.";
    }
}
