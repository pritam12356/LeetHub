class Solution {
    public int pivotIndex(int[] nums) {
    //     int ind=0;
        

    //    while(ind<nums.length){

    //     int leftSum=0, rightSum=0;

    //      for(int i=0;i<ind;i++){
    //         leftSum+=nums[i];
    //     }

    //     for(int i=ind+1;i<nums.length;i++){
    //         rightSum+=nums[i];
    //     }
        
    //     if(leftSum == rightSum) return ind;
        
    //     ind++;
    //    }

    //    return -1;


        int n= nums.length;
        int pivot=0;
        int prefixSum[]= new int [n];

        prefixSum[0]= nums[0];

        for(int i=1;i<n;i++){
            prefixSum[i]= prefixSum[i-1] + nums[i];
        }

        while(pivot<n){
            int temp= (pivot==0)?0:prefixSum[pivot-1];
            if(temp == (prefixSum[n-1] - prefixSum[pivot])){
                return pivot;
            }
            pivot++;
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna