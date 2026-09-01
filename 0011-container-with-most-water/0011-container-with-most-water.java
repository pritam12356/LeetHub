class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;

        int maxarea=0;
        int currarea=0;

        while(i<j){
            currarea= Math.min(height[i], height[j]) * (j-i);
            maxarea=Math.max(currarea,maxarea);

            if(height[i]< height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxarea;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna