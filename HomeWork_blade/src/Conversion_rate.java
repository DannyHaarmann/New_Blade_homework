
public class Conversion_rate 


{
public static long startingpeople = 7700000000L;
public static long disciples = 13L;	
public static int convert =  3;
public static int count = 0;
public static int lifespan = 54;
public static int age = 0;
public static long oldgroup;
public static long currentgroup = 7700000000L;
public static int agecounter;
public static int reproduction;
	public static int convert()
	{
		while(disciples <= currentgroup)
		{	
			System.out.println(disciples + " d");
			
			
				disciples = convert * disciples;
			
			
			
			count = count + 3;
			agecounter = agecounter + 3;
			reproduction = reproduction + 3;
			System.out.println(count + " count");
			
			oldgroup = startingpeople;
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				if(reproduction == 30)
				{
				currentgroup =  startingpeople + (startingpeople * 1/2);
				
				System.out.println("new group born " + currentgroup);
				reproduction = 0;
				
				}
			
				
				
				
				
				
				
				
				
				
				
			
			if(agecounter >= lifespan)
			{
				System.out.println(disciples);
				currentgroup = currentgroup - oldgroup;
				disciples = disciples - (disciples * 436/1000);
				System.out.println("first dead now new pop " + startingpeople);
				System.out.println(disciples + " d");
				System.out.println("--------------");
				System.out.println(currentgroup + " cg");
				agecounter = 0;
			}

		}
		
	return count;
	}
}
	

