public class Tomato extends Vegetable
{
    public Tomato()
    {
        super("Tomato", "Fruit");
        setInstructions(
              "Plant tomato bush with at least 24\" of space\n"
            + "Water 20 minutes, 3 times a week\n"
            + "Harvest when firm, plump, and red"
        );
    }
    
    public String feed()
    {
        return "Fertilize soil to increase phosphorous in proportion to nitrogen.";
    }
    
    public String water()
    {
        return "Water for at least 20 minutes for 3 times each week.";
    }
    
    public String harvest()
    {
        return "Harvest when the tomatoes are firm, full size, and are fully colored.";
    }
}
