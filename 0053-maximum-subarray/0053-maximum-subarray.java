class Solution {
    public int maxSubArray(int[] nums) {
        int low=0;
        int high=0;
        int sum=0;
        int res=Integer.MIN_VALUE;
       
        while(high<nums.length){
           sum=sum+nums[high];
           res=Math.max(res,sum);
           if(sum<0){
            sum=0;
            low=high+1;
           }
        high++;
        }
    return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna