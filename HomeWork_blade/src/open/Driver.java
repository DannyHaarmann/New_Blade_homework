package default;
import java.util.Random;
public class Driver {

	public static void main(String[] args) throws Exception {
		 int[] nums = new int[10000];

	        Random randomGenerator = new Random();

	        for (int i = 0; i < nums.length; ++i)
	        {
	            nums[i] = randomGenerator.nextInt(10000);
	        }
	}

}
