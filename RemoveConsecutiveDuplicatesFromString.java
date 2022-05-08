public class Solution 
{
    public static String removeConsecutive(StringBuilder str) 
	{
		if(str == null)
		{
			return str;
		}

		if(str.length() < 2)
		{
			return str;
		}
		
		if(str.charAt(0) == str.charAt(1))
		{
			return removeConsecutive(str.substring(1));
		}
		else
		{
			return str.charAt(0)+removeConsecutive(str.substring(1));
		}
    }
}
