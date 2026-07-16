class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // int arr[]=new int[nums1.length+nums2.length];
        // int i=0;
        // int j=0;
        // int k=0;
        // while(i<nums1.length && j<nums2.length){
        //     if(nums1[i]<nums2[j]){
        //         arr[k]=nums1[i];
        //         i+=1;
        //         k+=1;
        //     }
        //     else{
        //         arr[k]=nums2[j];
        //         j+=1;
        //         k+=1;
        //     }
        // }
        // while(i<nums1.length){
        //     arr[k]=nums1[i];
        //     i++;
        //     k++;
        // }
        // while(j<nums2.length){
        //     arr[k]=nums2[j];
        //     j++;
        //     k++;
        // }
        // int l=arr.length;
        // if(l%2==0){
        //     int mid1=arr[(l-1)/2];
        //     int mid2=arr[l/2];
        //     return (mid1+(mid2))/2.0;
        // }
        // else{
        //     return arr[l/2];
        // }
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0,j=0;
        int prev=0,now=0;
        int mid=(n1+n2)/2 +1;
        int c=0;
        while(i<n1&&j<n2){
            if(nums1[i]<nums2[j]){
                prev=now;
                now=nums1[i++];
                c++;
            }else{
                c++;
                prev=now;
                now=nums2[j++];
            }
            if(c==mid)  break;
        }
        while(i<n1&&c!=mid){
            prev=now;
            now=nums1[i++];
            c++;
            if(c==mid)  break;
        }
        while(j<n2&&c!=mid){
            prev=now;
            now=nums2[j++];
            c++;
            if(c==mid)  break;
        }
        if(n1+n2==1)    return now;
        else{
        // System.out.println(now+" "+prev);
            if((n1+n2)%2==0){
                return (now+prev)/2.0;
            }else{
                return now*1.0;
            }
        }
    }
}