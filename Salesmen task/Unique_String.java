
public class Unique_String 
{

	
	public static boolean scanWord(String word)
	{
		for(int i = 0; i < word.length(); i++)
		{
			for(int j = i + 1; j < word.length(); j++)
			{
				if(word.charAt(i) == word.charAt(j))
				return false;
			}
		}
	return true;
	}
}
