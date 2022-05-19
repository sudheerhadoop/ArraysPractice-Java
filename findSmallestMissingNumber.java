class GFG {
    
    public static int smallestNumber(int[] arr)
    {
        if(arr[0] != 0)
        {
            return 0;
        }
        
        if(arr[arr.length-1] == arr.length-1)
        {
            return arr.length;
        }
        
        int first = arr[0];
        
        return binarySearch(arr,0,arr.length-1,first);
        
    }
    
    public static int binarySearch(int a[], int start, int end, int first)
    {
        if(start < end)
        {
            int mid = (start+end)/2;
            
            if(a[mid] != mid+first)
            {
                return binarySearch(a,start, mid, first);
            }
            else{
                return binarySearch(a, mid+1, end, first);
            }
            
        }
        
        return start+first;
        
    }

    
    
	public static void main (String[] args) {
		//System.out.println("GfG!");
	    GFG g = new GFG();
	    int[] x = {0,1,2,3,5,6};
	    
	    int missing = g.smallestNumber(x);
	    System.out.println(missing);
	}
}
