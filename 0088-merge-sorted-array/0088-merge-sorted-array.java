class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res=new int[Math.max(nums1.length,nums2.length)];
        int i=0;
        int j=0;
        int ind=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                res[ind++]=nums1[i++];
            }else{
                res[ind++]=nums2[j++];
            }
        }
        while(i<m){
            res[ind++]=nums1[i++];
        }
        while(j<n){
            res[ind++]=nums2[j++];
        }
        int max=Math.max(nums1.length,nums2.length);
        for( i=0;i<res.length;i++){
            if(nums1.length>=max){
                nums1[i]=res[i];
            }else{
                nums2[i]=res[i];
            }
        }
    }
}