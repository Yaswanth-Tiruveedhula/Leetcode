class Solution {
    public int majorityElement(int[] nums) {
        int cand=nums[0];
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==cand){
                c++;
            }else{
                c--;
                if(c==0){
                    cand=nums[i];
                    c=1;
                }
            }
        }
        return cand;
    }
}