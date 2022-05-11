class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
     ArrayList<Integer> al = new ArrayList<Integer>(); 
        if(arr.length == 0)
        {
            return al;
        }
        
        int max = 0;
        

        
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i] > max)
            {
                al.add(arr[i]);
                max = arr[i];
            }
            
        }
        
        return al;
    }
}
