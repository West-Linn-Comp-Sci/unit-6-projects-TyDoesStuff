public class Array2DExplorer
{
    public static void main(String[] args)
    {
        Array2DExplorer explorer = new Array2DExplorer();
        
        int[][] arr = {
            {3, 5, 8, 6},
            {1, 0, 0, 4},
            {8, 9, 3, 1}
        };
        
        System.out.println(explorer.minRow(arr, 2));
        printIntArray(explorer.colMaxs(arr));
        printIntArray(explorer.allRowSums(arr));
        printDoubleArray(explorer.averageCol(arr));
        System.out.println(explorer.smallEven(arr));
        System.out.println(biggestRow(arr));
    }
    
    public static void printIntArray(int[] array)
    {
        System.out.print("{ ");
        for (int i : array)
        {
            System.out.print(i + " ");
        }
        System.out.println("}");
    }
    
    public static void printDoubleArray(double[] array)
    {
        System.out.print("{ ");
        for (double i : array)
        {
            System.out.print(i + " ");
        }
        System.out.println("}");
    }
    
    public int minRow(int[][] nums, int row)
    {
        int min = nums[row][0];
        for (int i : nums[row])
        {
            if (i < min)
                min = i;
        }
        return min;
    }
    
    public int[] colMaxs(int[][] matrix)
    {
        int[] result = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (result[j] < matrix[i][j])
                    result[j] = matrix[i][j];
            }
        }
        return result;
    }
    
    public int[] allRowSums(int[][] data)
    {
        int[] sums = new int[data.length];
        for (int i = 0; i < data.length; i++)
        {
            for (int j = 0; j < data[i].length; j++)
            {
                sums[i] += data[i][j];
            }
        }
        return sums;
    }
    
    public double[] averageCol(int[][] nums)
    {
        double[] avg = new double[nums[0].length];
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < nums[i].length; j++)
            {
                avg[j] += nums[i][j];
            }
        }
        for (int k = 0; k < avg.length; k++)
        {
            avg[k] /= (double)nums.length;
        }
        return avg;
    }
    
    public int smallEven(int[][] matrix)
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (min > matrix[i][j])
                    min = matrix[i][j];
            }
        }
        return min;
    }
    
    public static int biggestRow(int[][] nums)
    {
        int rowIndex = 0;
        int rowSumMax = 0;
        for (int i = 0; i < nums.length; i++)
        {
            int sum = 0;
            for (int j = 0; j < nums[i].length; j++)
            {
                sum += nums[i][j];
            }
            if (sum > rowSumMax)
            {
                rowIndex = i;
                rowSumMax = sum;
            }
        }
        return rowIndex;
    }
}
