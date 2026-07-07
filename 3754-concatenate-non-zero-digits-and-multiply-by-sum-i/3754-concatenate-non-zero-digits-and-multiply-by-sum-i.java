class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        String s="";
        while(n>0){
            int rem=n%10;
            if(rem!=0){
                sum+=rem;
                s=rem+s;
            }
            n/=10;
        }
        if(s.length()>0){
        long val=Long.parseLong(s);
                        return val*sum;
        }else{
            return 0;
        }
    }
}