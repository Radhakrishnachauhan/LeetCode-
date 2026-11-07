class Solution {
    public long countValidSubstrings(String s) {
       long totalV=0;
        int n=s.length();
        int last1=-1;
        int last2=-1;
        int res=-1;
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                last1=i;
            }else if(ch=='b'){
                last2=last1;
            }
            else if(ch=='c'){
                if(last2!=-1){
                    res=Math.max(res,last2);
                }
            }
            totalV+=(i-res);
        }
        return totalV;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna