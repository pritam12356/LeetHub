class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet <Integer> set=new HashSet<>();

        int i=0;
        int j=0;
        int n = nums.length;
        long maxSum=0;
        long currSum=0;

        while(j<n){
            while(set.contains(nums[j])){
                currSum-= nums[i];
                set.remove(nums[i]);
                i++;
            }

            set.add(nums[j]);
            currSum+=nums[j];

            if((j-i +1) == k){
                maxSum=Math.max(currSum,maxSum);
                currSum-=nums[i];
                set.remove(nums[i]);
                i++;
            }
            j++;
        }
        
         return maxSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna