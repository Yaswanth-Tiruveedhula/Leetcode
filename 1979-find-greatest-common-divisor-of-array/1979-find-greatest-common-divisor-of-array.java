class Solution {
    public int findGCD(int[] nums) {
        int max=0;
        int min=10001;
        for(int i:nums){
            max=Math.max(i,max);
            min=Math.min(i,min);
        }
        return gcd(min,max);
    }
    public int gcd(int a,int b){
        if(b==0)    return a;
        return gcd(b,a%b);
    }
}