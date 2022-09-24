public class Test_Code 
{

        public static String Convert_space(String input)
        {
            String allowChar = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String result = " ";
            for(int i = 0; i <input.length(); i++)
            {
                if(allowChar.indexOf(input.charAt(i)) >= 0)
                {
                    result = result + input.charAt(i);
                }
            }

            return result;
        }
        public static boolean StringCompareIgnoreCase(String in1, String in2)
        {
            return in1.toLowerCase().equals(in2.toLowerCase());
        }
        public static String[] Split_with_Space(String input) 
        {
            return input.split(" ");

        }
        public static int OccurCount(String write, String kk)
        {
            String write1 = Convert_space(write);
            String [] arr = Split_with_Space(write1);

            int result = 0;
            for(int i = 0 ; i < arr.length; i ++)
            {
                if(StringCompareIgnoreCase(arr[i], kk))
                {
                    result++;
                }
            }
            return result;
        }



}