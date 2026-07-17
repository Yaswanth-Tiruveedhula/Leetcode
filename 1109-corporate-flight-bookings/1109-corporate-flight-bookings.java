class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res=new int[n];
        int ind=0;
        for(int[] i:bookings){
            int left=i[0]-1;
            int right=i[1]-1;
            while(left<=right){
                if(left==right){
                    res[left++]+=i[2];
                }else{
                res[left++]+=i[2];
                res[right--]+=i[2];
            }
            }
        }
        return res;
    }
}