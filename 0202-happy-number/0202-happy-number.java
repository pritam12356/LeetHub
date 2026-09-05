class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set= new HashSet<>();

      while(true){
        int ans=0;

        while(n>0){
            int lastDigit=n% 10 ;
            ans+= lastDigit * lastDigit;
            n=n/10;

        }
        if(set.contains(ans)){
            return false;
        }
        set.add(ans);

        if(ans==1) return true;
        n=ans;
      }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna