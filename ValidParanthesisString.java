public class Solution {
	public static boolean checkValidString(String s) {
        // Write your code here.	
		int leastOpen=0; int maxOpen = 0;
		
		char[] str = s.toCharArray();
		
		for(char c : str)
		{
			if(c == '(')
			{
				leastOpen++;
				maxOpen++;
			}
			else if(c == ')')
			{
				leastOpen--;
				maxOpen--;
			}
			else
			{
				leastOpen--;
				maxOpen++;
			}
		
			
		 leastOpen = Math.max(0,leastOpen);
			if(maxOpen < 0)
			{
			return false;
			}
		}
		return leastOpen == 0;
		
}
}
