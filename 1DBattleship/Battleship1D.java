import java.util.Random;

class Battleship1D
{
  int[] slots = new int[7];
  
  public Battleship1D()
  {
    Random rand = new Random();
    int n = rand.nextInt(5);
    
    for (int x = 0; x < 7; x++)
    {
      slots[x] = 0;
    }

    slots[n] = 1;
    slots[n + 1] = 1;
    slots[n + 2] = 1;
  }

  public int getSlot(int x)
  {
    return slots[x];
  }
}