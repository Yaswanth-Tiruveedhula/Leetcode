class Solution {
    public int maxArea(int[] height) {
        int max=0;
        // int s/ize=0;
        int i=0;
        // while(i<height.length){
            int j=height.length-1;
        while(i<j){
            int sum=Math.min(height[i],height[j]);
            sum*=(j-i);
            // if(sum>max){
            //     max=sum;
            //     size=Math.max(size,j-i);
            // }
            max=Math.max(max,sum);
            // i++;
            if(height[i]<height[j]){
                i++;
            }else j--;
        }
        i++;
        
        return max;
    }
}