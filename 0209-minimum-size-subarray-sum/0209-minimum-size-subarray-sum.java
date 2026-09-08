class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int l=0;
        // int h=0;
        // int sum=0;
        // int minlen=Integer.MAX_VALUE;

        // for(h=0;h<nums.length;h++){
        //     sum=sum+ nums[h];

        //     while(sum>= target){
        //         minlen=Math.min(minlen, h-l + 1);

        //         sum = sum - nums[l];
        //         l++;
        //     }
            
        // }
        // return (minlen== Integer.MAX_VALUE)? 0 : minlen;



        int i=0, j=0;
        int minSize=Integer.MAX_VALUE, sum=0;
        

        while(j<nums.length){
            sum+=nums[j];

            while(sum>= target){
                minSize=Math.min((j-i) +1, minSize);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return minSize == Integer.MAX_VALUE ? 0:minSize;


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna