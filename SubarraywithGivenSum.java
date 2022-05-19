//Sliding window pattern

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        
    ArrayList<Integer> al = new ArrayList<Integer>();
    int currentsum = arr[0];
    int start = 0;
    int i;
    
    for(i=1;i<=n;i++)
    {
        
        while(currentsum > s && start < i-1)
        {
            currentsum = currentsum - arr[start];
            start++;
            
        }
        
        if(currentsum == s)
        {
            int p = i-1;
            al.add(start+1);
            al.add(p+1);
            return al;
        }
        
        if(i < n)
            currentsum = currentsum + arr[i];
    
    }
    
   if(currentsum != s)
   {
       al.add(-1);
   }
    return al;
    
    }
}
