import java.util.Scanner;

class Battleship1DRunner
{
  public static void main(String[] args)
  {
    Battleship1D battleShip = new Battleship1D();
    Scanner sc = new Scanner(System.in);

    int hits = 0;
    double guesses = 0;
    
    while (hits < 3)
    {
      System.out.println("\nEnter an integer between 1 and 7 to make your guess");
      
      String input = sc.nextLine();
      int guess = Integer.parseInt(input);
      
      guesses++;

      if (guess >= 1 && guess <= 7)
      {
        if (battleShip.getSlot(guess - 1) == 1)
        {
          hits++;
          System.out.println("BattleShip Hit! You now have " + hits + " hits");
        } 
        else 
        {
          System.out.println("BattleShip missed! You still have " + hits + " hits");
        }
      } 
      else 
      {
        System.out.println("Invalid guess, please try again");
      }
      
      if (hits == 3)
        break;
    }

    double accuracy = 3.0 / guesses;

    System.out.println("\n****************************************************");
    System.out.println("Congratulations! You have sunk the enemy BattleShip!");
    System.out.println("You guessed " + guesses + " times, giving you an accuracy of " + (int)(accuracy*100) + "%");
    System.out.println("****************************************************");
  }
}

