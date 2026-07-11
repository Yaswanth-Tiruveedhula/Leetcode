class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr=new int[nums.length];
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }else pos.add(nums[i]);
        }
        int k=0,m=0;
        for(int ind=0;ind<arr.length;ind++){
            if(ind%2==0){
                arr[ind]=pos.get(k++);
            }else{
                arr[ind]=neg.get(m++);
            }
        }
        return arr;
    }
}