class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int low=0;
        int n=s.length();
        int res=-1;
        
        HashMap<Character, Integer>hm=new HashMap<>();
        
        for(int high=0; high<n; high++){
            char rc= s.charAt(high);
            hm.put(rc, hm.getOrDefault(rc,0)+1);
            
            while(hm.size()>k){
                char lc=s.charAt(low);
                hm.put(lc, hm.get(lc)-1);
                
                if(hm.get(lc)==0){
                    hm.remove(lc);
                }
                low++;
            }
                
                if(hm.size()==k){
                    int len=high-low+1;
                    res=Math.max(res,len);
                }
            }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna