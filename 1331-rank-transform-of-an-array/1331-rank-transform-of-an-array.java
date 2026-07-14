class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp=Arrays.copyOf(arr,arr.length);
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(temp);
        int rank=1;
        for(Integer i:temp){
            if(!map.containsKey(i)){
                map.put(i,rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}