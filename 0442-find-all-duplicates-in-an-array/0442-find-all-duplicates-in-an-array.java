class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        int[] freq=new int[n];
        for(int i=0;i<n;i++){
            freq[nums[i]-1]++;
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(freq[i]==2){
                arr.add(i+1);
            }
        }
        return arr;
    }
}