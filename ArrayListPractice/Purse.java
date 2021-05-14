import java.util.ArrayList;
public class Purse
{ 
    private ArrayList<Coin> coins; 
 
    public Purse()
    { 
        coins = new ArrayList<Coin>(); 
    }
 
    // adds aCoin to the purse 
    public void add(Coin aCoin)
    { 
        coins.add(aCoin); 
    } 
 
    // returns total value of all coins in purse 
    public double getTotal()
    { 
        int total = 0;
        for (Coin c : coins)
        {
            total += c.getValue();
        }
        return total;
    } 
     
    // returns the number of coins in the Purse that matches aCoin 
    // (both myName & myValue) 
    public int count(Coin aCoin)
    {
        int count = 0;
        for (Coin c : coins)
        {
            if (c.equals(aCoin))
                count++;
        }
        return count;
    }
    
    public String findSmallest()
    {
        Coin min = coins.get(0);
        for (Coin c : coins)
        {
            if (c.getValue() < min.getValue())
                min = c;
        }
        return min.getName();
    }
 
// returns the name of the Coin in the Purse that has the smallest value 
}