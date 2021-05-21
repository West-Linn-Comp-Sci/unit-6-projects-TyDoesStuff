public class Carrot extends Vegetable
{
    public Carrot()
    {
        super("Carrot", "Root");
        setInstructions(
              "Sow seeds into soil with at least 9\" of space\n"
            + "Water 20 minutes, once a week\n"
            + "Harvest when roots are proper size"
        );
    }
    
    public String feed()
    {
        return "Apply fertilizer rich in nutrients before planting.";
    }
    
    public String water()
    {
        return "Water to fill 1 inch of soil every week. (roughly 20 minutes)";
    }
    
    public String harvest()
    {
        return "Harvest when the top of the roots are an inch in diameter.";
    }
}
