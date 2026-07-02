class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0,tot=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            tot+=i;
        }
        tot+=n;
        return tot-sum;
    }
}