class Solution {
    public boolean isPossible(int[] nums) {
        // int n=nums.length;
        // int range=nums[n-1];
        // int[] freq=new int[nums[n-1]];
        // for(int k:nums){
        //     freq[k-1]++;
        // }
        // int j=0;
        // int st=0;
        // for(int i=0;i<range;i++){
        //     if(i>0&&freq[i]==0&&(freq[i-1]>0)){
        //         return false;
        //     }
        // }
        // while(st>freq.length&&freq[st]>0){
        //     int c=0;
        //     for(int i=st;i<range;i++){
        //         if(freq[i]==0){
        //             break;
        //         }else{
        //             if(i>0&&(freq[i]==1&&freq[i-1]>0)){
        //                 break;
        //             }
        //             c++;
        //             freq[i]--;
        //         }
        //     }
        //     while(st<freq.length&&freq[st]==0){
        //         st++;
        //     }
        //     // st++;
        //     if(c<3&&c!=0) return false;
        // }
        
        HashMap<Integer,Integer> freq=new HashMap<>(),need=new HashMap<>();
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(freq.get(i)==0)      continue;
            if(need.getOrDefault(i,0)>0){
                need.put(i,need.get(i)-1);
                need.put(i+1,need.getOrDefault(i+1,0)+1);
            }else if(freq.getOrDefault(i+1,0)>0&&freq.getOrDefault(i+2,0)>0){
                freq.put(i+1,freq.get(i+1)-1);
                freq.put(i+2,freq.get(i+2)-1);
                need.put(i+3,need.getOrDefault(i+3,0)+1);
            }else{
                return false;
            }
            freq.put(i,freq.get(i)-1);
        }
        return true;




        // int i=0;
        // while(i<n){
        //     int j=i;
        //     for(i=i;i<n-1;i++){
        //         if(freq[i]==freq[i+1])    break;
        //         if(nums[i]!=nums[i+1]-1)    break;
        //     }
        //     if(i-j+1<3) return false;
        //     i++;
        // }
        // return true;
    }
}