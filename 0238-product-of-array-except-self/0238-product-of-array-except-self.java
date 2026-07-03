class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pr=1;
        int c=0;
        boolean con=false;
        for(int i:nums){
            if(i!=0){
            pr*=i;
            }else{
                c++;
            con=true;
            }
        }
        int[] res=new int[nums.length];
        if(c==nums.length){
            return res;
        }
        for(int i=0;i<nums.length;i++){
            if(con==true){
                if(nums[i]!=0){
                    res[i]=0;
                }else if(c>1){
                    res[i]=0;
                }
                else{
                    res[i]=pr;
                }
            }
            else{
                res[i]=pr/nums[i];
        }
        }
        return res;
    }
}