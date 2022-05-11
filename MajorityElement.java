class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
       HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
       int majorityelement = -1;
       if(a.length == 0)
       {
           return -1;
       }
       if(a.length == 1)
       {
           return a[0];
       }
       for(int i=0;i<a.length;i++)
       {
         if(m.containsKey(a[i]))
         {
            int count = m.get(a[i])+1;
            if(count > a.length/2)
            {
                majorityelement = a[i];
            }
            else
            {
                m.put(a[i], count);
            }
         }
         else{
             m.put(a[i],1);
         }
       }
       return majorityelement;
    }
}
