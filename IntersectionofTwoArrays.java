import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
      Arrays.sort(nums2);
        
     Set<Integer> s = new HashSet<Integer>();
    
        int i=0;
        int j =0;
        
        int k =0;
        while(i < nums1.length && j < nums2.length )
        {
            if(nums1[i] < nums2[j])
            {
                i++;
            }
            else if(nums1[i] > nums2[j])
            {
                j++;
            }
            else{
             s.add(nums1[i]);
                i++;
                j++;
                k++;
            }
        }
        
        int[] arr = new int[s.size()];
        int a = 0;
        
        for(int ele: s)
        {
            arr[a] = ele;
            a++;
        }
        
        return arr;
        
        
    }
}
