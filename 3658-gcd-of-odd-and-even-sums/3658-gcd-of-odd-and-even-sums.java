class Solution {
    public int gcdOfOddEvenSums(int n) {
        return oddsum(n);
    }
    public int oddsum(int n){
        int sum=0,i=1,eve=0,j=2;
        while(n-- >0){
            sum+=i;
            eve+=j;
            i+=2;
            j+=2;
        }
        System.out.println(sum+" "+eve);
        int gcd=comf(sum,eve);
        return gcd;
    }
    public int comf(int a,int b){
        if(b==0)    return a;
        else return comf(b,a%b);
    }
}