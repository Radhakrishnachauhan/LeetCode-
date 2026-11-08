class Solution {
    public int characterReplacement(String s, int k) {
        
        int n=s.length();
        int low=0;
        int res=Integer.MIN_VALUE;
        int []f=new int[256];
        int maxcount=0;

        for(int high=0; high<n; high++){
            char currChar=s.charAt(high);
            f[currChar]++;

            maxcount=Math.max(maxcount,f[currChar]);
            int length=high-low+1;
            int diff=length-maxcount;

            while(diff>k){
                f[s.charAt(low)]--;
                low++;
                length=high-low+1;
                diff=length-maxcount;
            }
            res=Math.max(res,length);
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna