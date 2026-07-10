class Solution {
    public int findShortestSubArray(int[] nums) {
        if(nums.length<=1)  return 1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        int ele=0;
        for(Integer i:map.keySet()){
            if(map.get(i)>max){
                max=map.get(i);
            }
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(Integer i:map.keySet()){
            if(map.get(i)==max){
                arr.add(i);
                ele++;
            }
        }
        int[] brr=new int[ele];
        System.out.println(ele);
        while(ele >0){
            int res=arr.get(ele-1);
            int i=0,j=nums.length-1;
            while(i<j){
                if(nums[i]!=res){
                    i++;
                }else{
                    break;
                }
            } 
            while(j>i){
                if(nums[j]!=res){
                    j--;
                }else{
                    break;
                }
            }
            brr[ele-1]=j-i+1;
            ele--;
        }
        Arrays.sort(brr);
        return brr[0];
    }
}