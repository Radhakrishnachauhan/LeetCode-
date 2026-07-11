class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0, end=0;
        int n=nums.length, sum=0;
        int res=Integer.MAX_VALUE;

        while(end<n){
            sum=sum+nums[end];

            while(sum>=target){
                int length = end-start+1;
                res=Math.min(res,length);
                sum= sum-nums[start];
                start++;
            }
            end++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna