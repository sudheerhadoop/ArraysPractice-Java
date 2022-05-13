class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        
        long left[] = new long[n];
        long right[] = new long[n];
        long prod[] = new long[n];
        
        int i,j;
        
        left[0] = 1;
        right[n-1] = 1;
        
        for(i=1;i<n;i++)
        {
            left[i] = nums[i-1] * left[i-1];
        }
        
        for(j=n-2;j>=0;j--)
        {
            right[j] = nums[j+1] * right[j+1];
        }
        
        
        for(int k=0;k<n;k++)
        {
            prod[k] = left[k] * right[k];
        }
        
     return prod;   
        
        
	} 
} 
