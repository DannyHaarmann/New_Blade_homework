
public class Slow_Sort 
{

	
	  void bubbleSort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++)
	            for (int j = 0; j < n - i - 1; j++)
	                if (arr[j] > arr[j + 1]) 
	                {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	    }
	  void selectionsort(int arr[])
	    {
	        int n = arr.length;
	 
	        
	        for (int i = 0; i < n-1; i++)
	        {
	            
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	                if (arr[j] < arr[min_idx])
	                    min_idx = j;
	            int temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
	        }
	    }
	  void Insertionsort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) 
	        {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) 
	            {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }
	  int Shellsort(int arr[])
	    {
	        int n = arr.length;
	 
	        for (int gap = n/2; gap > 0; gap /= 2)
	        {
	            for (int i = gap; i < n; i += 1)
	            {
	                int temp = arr[i];
	                int j;
	                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
	                    arr[j] = arr[j - gap];
	                arr[j] = temp;
	            }
	        }
	        return 0;
	    }
	  void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	  
}
