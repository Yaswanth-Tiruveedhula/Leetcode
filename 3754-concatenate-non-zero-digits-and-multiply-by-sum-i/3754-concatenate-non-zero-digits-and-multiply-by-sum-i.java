class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long num=0;
        while(n>0){
            int rem=n%10;
            if(rem!=0){
                sum+=rem;
                num*=10;
                num+=rem;
            }
            n/=10;
        }
        long rem=0;
        while(num>0){
            rem=rem*10+(num%10);
            num/=10;
        }
        return sum*rem;
    }
}