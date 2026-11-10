class Solution {
    public void rotate(int[] nums, int k) {
         int n=nums.length;
       k=k%n;
       if(k==0)return;

        rev(nums,0,n-1);
        rev(nums,k,n-1);
        rev(nums,0,k-1);
    }
    private void rev(int[] arr, int i, int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna