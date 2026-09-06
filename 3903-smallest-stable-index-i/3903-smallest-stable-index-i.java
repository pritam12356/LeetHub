class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ind=0;
        
      while(ind<nums.length){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<=ind;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }

        for (int i=ind;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }

        if((max-min)<=k ) return ind;

        ind++;
      }

      return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna