import java.util.Arrays;
public class Matrix_Homework 
{
	static int[] findAns(int[][] arr, int target)
    {
        int row = 0;
        int collum = arr[row].length - 1;
        while (row < arr.length && collum >= 0) {
            if (arr[row][collum] == target) {
                return new int[] { row, collum };
            }

            if (arr[row][collum] < target) {
                row++;
            }
            
            else {
                collum--;
            }
        }
        return new int[] { -1, -1 };
    }
 
    
    public static void main(String[] args)
    {
 
        
        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 } };
        int[] ans = findAns(arr, 1);
        System.out.println("Element found at index: "+ Arrays.toString(ans));
    }

}

