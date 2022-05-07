import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     
        int len = nums.length;
        
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0;i<len-2;i++)
        {
            
            if(i==0 || i>0 && nums[i] != nums[i-1])
            {
                
            
            int left = i+1;
            int right = len-1;
            
            while(left < right)
            {
                if(nums[i]+nums[left]+nums[right] == 0)
                {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[left]);
                    l.add(nums[right]);
                    ans.add(l);
                while(left < right && nums[left] == nums[left+1])
                {
                    left++;
                }
                while(left < right && nums[right] == nums[right-1])
                {
                    right--;
                }
                    left++;
                    right--;
                }
                else if(nums[i]+nums[left]+nums[right] < 0)
                {
                    left++;
                }
                else{
                    right--;
                }
                
            }
          }
        }
        return ans;
       
    }
}
