class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int ind=j;
        int[] res=new int[nums.length];
        while(i<=j){
            int left=nums[i]*nums[i];
            int right=nums[j]*nums[j];
            if(left>right){
                res[ind]=left;
                i++;
            }else{
                res[ind]=right;
                j--;
            }
            ind--;
        }
        return res;
    }
}