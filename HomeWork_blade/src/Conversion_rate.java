
public class Conversion_rate 


{
public static long people = 7700000000L;
public static float disciples = 13L;	
public static int convert =  3;
public static int count = 0;
public static float years = 0L;
public static float d2 = 13;
public static long p2 = 7700000000L;
public static float c2 = 4F;
 

	public static int convert()
	{
		while(disciples <= people)
		{	
			{
			System.out.println(disciples);
			disciples = convert * disciples;
			count = count + 3;
			}

		}
	return count ;
	}
	public static float less_then_50()
	{
		while(years < 50 && d2 < p2 )
		{
			System.out.println(d2);
			d2 = c2 * d2;
			years = years + 3;
		}
		return years;
	}
	
}
