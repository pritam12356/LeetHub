class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<>();

        for (int i=0;i<nums.length;i++){
            int complement=target - nums[i];

            if(map.containsKey(complement)){
                return new int [] {i, map.get(complement)};
            }
            else {
                map.put(nums[i],i);
            }
        }
        return new int []{};



        // int i=0;
        // int j=nums.length-1;

        // while(i<j){
        //    if(nums[i] + nums[j] == target){
        //     return new int [] {i,j};
        //    }
        //    else if (nums[i] + nums[j] < target){
        //     i++;
        //    }
        //    else{
        //     j--;
        //    }
        // }
        // return new int [] {};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna