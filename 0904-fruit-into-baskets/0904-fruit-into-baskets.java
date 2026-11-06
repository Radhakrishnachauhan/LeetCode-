class Solution {
    public int totalFruit(int[] fruits) {
        int low=0;
        int n=fruits.length;
        int res=0;
        int k=2;
        HashMap<Integer,Integer>hm=new HashMap();
        for(int high=0; high<n; high++){
            int ri=fruits[high];
            hm.put(ri, hm.getOrDefault(ri,0)+1);

            while(hm.size()>k){
                int li=fruits[low];
                hm.put(li, hm.get(li)-1);

                if(hm.get(li)==0){
                    hm.remove(li);
                }
           low++;
            }
            if(hm.size()<=k){
                int length=high-low+1;
                res=Math.max(res, length);
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna