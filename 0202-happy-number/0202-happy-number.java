class Solution {
    public boolean isHappy(int n) {
        if(n==1)    return true;
        int k=n;
        do{
            // int k=n;
            n=pool(n);
            k=pool(pool(k));
            // if(n==1){
                // return true;
            // }
            // if(k==n)    return false;
        }while(k!=n);
        return n==1;
    }
    public int pool(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=(rem*rem);
            n/=10;
        }
        return sum;
    }
}