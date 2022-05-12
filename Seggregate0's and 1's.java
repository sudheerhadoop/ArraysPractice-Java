class Solution {
    void segregate0and1(int[] arr, int n) {
        // code here
        int low = 0;
        int mid = 0;
        int high = n-1;
        
        if(arr.length == 0)
        {
            return;
        }
        while(mid <= high)
        {
            if(arr[mid] == 0)
            {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }
