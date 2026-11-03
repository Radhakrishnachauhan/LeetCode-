class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return"";
        }
        int gcdLength= gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
        
    }
    //this formula use to find GCD of two number Euclidean Algorithm aur Recursion ka use kiya gaya hai.

     public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna