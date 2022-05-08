public class Solution {

	public static String isSubsequence(String str1, String str2) {    
    	// Write your code here.
		int i = 0;
		int j = 0;
		
		int count = 0;
		
		while(i < str1.length() && j < str2.length())
		{
			if(str1.charAt(i) == str2.charAt(j))
			{
				i++;
				j++;
				count++;
			}
			else
			{
				j++;
			}
		}
		
		if(count == str1.length())
		{
			return "True";
		}
		else
		{
			return "False";
		}
	}

}
