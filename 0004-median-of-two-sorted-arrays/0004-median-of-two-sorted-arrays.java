class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //double mid=0;//for store the median value...

    int n=nums1.length;
    int m=nums2.length;
    int[] result=new int [n+m];
    int i=0, j=0, k=0;
    
    while(i<n && j<m){
        if(nums1[i]<nums2[j]){
            result[k++]=nums1[i++];
        }
        else{
            result[k++]=nums2[j++];
        }
    } 

        while(i<n){
            result[k++]=nums1[i++];
        }

        while(j<m){
            result[k++]=nums2[j++];
        }

        //for find median..
        int a=result.length;
         if (a % 2 == 1) {
            return result[a / 2];
        } else {
            return (result[a / 2 - 1] + result[a / 2]) / 2.0;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna