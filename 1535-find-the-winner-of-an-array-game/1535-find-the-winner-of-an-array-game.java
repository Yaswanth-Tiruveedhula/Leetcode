class Solution {
    public int getWinner(int[] arr, int k) {
        int n=arr.length;
        if(k>=n){
            int max=0;
            for(int i:arr){
                max=i>max?i:max;
            }
            return max;
        }
        int c=0;
        int max=arr[0];
        for(int i:arr){
            if(i<max){
                c++;
            }else if(i>max){
                max=i;
                c=1;
            }
            if(c==k){
                return max;
            }

        }
        return max;

    }
}