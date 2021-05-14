import java.util.*;
/**
 * Write a description of class FrequencyChart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FrequencyChart
{   
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] chart = new int[10];
        
        System.out.println("Please enter any numbers between 1-100");
        System.out.println("Enter 'stop' when finished\n");
        
        while (true)
        {
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("stop"))
                break;
            
            int num = Integer.parseInt(input);
            
            if (num > 0 && num <= 100)
            {
                chart[num/10]++;
            }
            else
            {
                System.out.println("Invalid input :(");
            }
        }
        
        for (int i = 0; i < 10; i++)
        {
            String left = (i*10+1) + " - " + ((i+1)*10);
            String right = "";
            
            for (int j = 0; j < chart[i]; j++)
            {
                right += "*";
            }
            
            if (i == 0)
                left += " ";
            if (i != 9)
                left += " ";
            
            System.out.println(left + " | " + right);
    }
    }
}
