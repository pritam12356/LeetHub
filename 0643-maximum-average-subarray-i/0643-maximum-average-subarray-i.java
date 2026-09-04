class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // if(k> nums.length) return 0;
        // double sum= 0;

        // for (int i=0; i<k; i++){
        //     sum= sum + nums[i];
        // }

        // int low= 0;
        // int high= k;
        // double ans= sum ;

        // while(high < nums.length){

        //     sum= sum - nums[low] + nums[high];

        //     if(ans < sum){
        //         ans = sum;
        //     }
        //     low++;
        //     high++;
        // }
        // return ans/k;


        if(k>nums.length) return 0;

        double currSum=0;

        for(int i=0;i<k;i++){
            currSum+=nums[i];
        }

        double maxSum=currSum;

        for(int i=k;i<nums.length;i++){
            currSum+=nums[i] - nums[i-k];
            if(currSum > maxSum){
                maxSum=currSum;
            }
        }
        return maxSum/k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna