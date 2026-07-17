class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res=new int[n];
         int[] pre=new int[n];
        for(int[] i:bookings){
            int left=i[0]-1;
            int right=i[1]-1;
            pre[left]+=i[2];
            if(right<n-1) pre[right+1]-=i[2];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=pre[i];
            res[i]=sum;
        }
        return res;
    }
}