class Solution {
    public boolean isUgly(int n) {
        int k=n;
        if(n==0)    return false;
        while(n%2==0){
            n/=2;
        }
        // System.out.println(n);
        while(n%3==0){
            n/=3;
        }
        // System.out.println(n);
        while(n%5==0){
            n/=5;
        }
        // System.out.println(n);
        return n==1;
    }
}