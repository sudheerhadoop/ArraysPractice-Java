class Solution
{
    public int[] twoOddNum(int Arr[], int N)
    {
        // code here
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        
        for(int i=0;i<N;i++)
        {
            if(hmap.containsKey(Arr[i]))
            {
                hmap.put(Arr[i], hmap.get(Arr[i])+1);
            }
            else
            {
                hmap.put(Arr[i],1);
            }
        }
        
        int a[] = new int[2];
        int x = 0;
        for(Map.Entry<Integer,Integer> e: hmap.entrySet())
        {
            if(e.getValue() % 2 != 0 )
            {
              a[x] = e.getKey();
              x++;
            }
            
        }
        
        return a;
        
    }
}
