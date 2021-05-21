public abstract class Vegetable implements Growable
{
    String name;
    String type;
    String instructions;
    
    public Vegetable(String name, String type)
    {
        this.name = name;
        this.type = type;
        instructions = "No instructions!";
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getType()
    {
        return type;
    }
    
    @Override
    public String getInstructions()
    {
        return instructions;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    protected void setInstructions(String instructions)
    {
        this.instructions = instructions;
    }
}
