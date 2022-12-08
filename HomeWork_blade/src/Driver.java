import java.util.Random;
public class Driver {

	public static void main(String[] args) throws Exception {
	
		 
	        
	        Danny list = new Danny();
	        for (int i = 0; i < 10000; ++i)
	        {
	        	String Filled = "" + (int)(Math.random() * 1000000);
	        	//System.out.println(Filled);
	        	list.Add(Filled, Filled);
	        	//System.out.println(list);  
	        	
	         }
	        long StartTime = System.currentTimeMillis();
	        for(int i = 0; i < 100; i++)
	        {
	        	String randomMan = "" + (int)(Math.random() * 1000000);
	        	HashNode result = list.Get(randomMan);
	        	if(result != null)
	        	{
	        		
	        		System.out.println(randomMan +  " is at " + result.Code);
	        	}
	        	else
	        	{
	        		System.out.println(randomMan + " failed test ");
	        		
	        	}
	        }
	        long EndTime = System.currentTimeMillis();
	        
	        System.out.println("Time Spent " + (EndTime - StartTime) + "ms"); 
	}

}
