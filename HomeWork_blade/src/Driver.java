import java.util.Arrays;
import java.util.Random;
import java.lang.Math;
import java.io.*;
import java.util.*;

public class Driver 
{
    public static void main(String[] args)
    {
   	
	        StackMin s = new StackMin();
	       
	          
	        s.push(3);
	        s.push(5);
	        s.getMin();
	        s.push(2);
	        s.push(1);
	        s.getMin();
	        s.pop();
	        s.getMin();
	        s.pop();
	    }
    /*
        //String kk = "In the beginning God created the heavens and the earth.";
        //String Bob = "the";
    //String key = "jane";
    //System.out.println(Unique_String.scanWord(key));
    //System.out.println(Test_Code.OccurCount(kk,Bob));
    //System.out.println(Conversion_rate.convert());
    //System.out.println(Conversion_rate.less_then_50());
    
    	
    	
    	
    	
    	
    	
    double[] arr1 = getArray(10000);
    long b = System.currentTimeMillis();
    long startTime = System.currentTimeMillis();
    long endTime = System.currentTimeMillis();
    long executionTime = endTime - startTime;
    	
    startTime = System.currentTimeMillis();
    (new Merge_sort()).mergeSort(arr1);
    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;
    System.out.printf(" The time taken is = "+ "%12s%2s\n", executionTime, " ms");
    
    	
    	
    	
    }
    
    public static double[] getArray(int n)
    {
        double[] arr = new double[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = ((double)(Math.random()*1000));
        }
        return arr;
    }
    	
    	
    	
    	/*
    	{
        Slow_Sort bubble = new Slow_Sort();
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        
        bubble.bubbleSort(arr);
        bubble.printArray(arr);
    	}
    	{
    	Slow_Sort Selection = new Slow_Sort();
        int arr[] = {64,25,12,22,11};
        
        Selection.selectionsort(arr);
        Selection.printArray(arr);
    	}
    	{
            int arr[] = { 12, 11, 13, 5, 6 };
      
            Slow_Sort insertionsort = new Slow_Sort();
            insertionsort.Insertionsort(arr);
            insertionsort.printArray(arr);
        }
    	   {
    	        int arr[] = {12, 34, 54, 2, 3};
    	  
    	        Slow_Sort shellsort = new Slow_Sort();
    	        shellsort.Shellsort(arr);
    	        shellsort.printArray(arr);
    	    }
    	    */
    }

