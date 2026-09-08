class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set= new HashSet<>();
        
        int i=0, j=0;
        int maxSize=0;
        // int currSize=0;

        while(j< s.length()){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;

            }

            set.add(s.charAt(j));
            maxSize=Math.max(set.size(), maxSize);
            j++;
        }
        return maxSize;
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna