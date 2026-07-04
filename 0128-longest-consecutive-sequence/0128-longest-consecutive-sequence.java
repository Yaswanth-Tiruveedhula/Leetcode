class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0)  return 0;
        int max=nums[0];
        int c=1;
        int maxcount=1;
        for(int i=0;i<nums.length;i++){
            if(max!=nums[i]){
                if(max==nums[i]-1){
                    c++;
                    max=nums[i];
                    maxcount=Math.max(maxcount,c);
                }else{
                    c=1;
                    max=nums[i];
                }
            }
        }
        return maxcount;
    }
}