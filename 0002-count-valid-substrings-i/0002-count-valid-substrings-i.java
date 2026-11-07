class Solution {
    public long countValidSubstrings(String s) {
        long totalV=0;
        long last=-1;
        int n=s.length();

        for(int j=0; j<n; j++){
            if(j>=2 && s.charAt(j-2) == 'a' && s.charAt(j-1) == 'b' && s.charAt(j)== 'c'){
                last=j-2;
            }
            totalV+=(j-last);
        }
        return totalV;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna