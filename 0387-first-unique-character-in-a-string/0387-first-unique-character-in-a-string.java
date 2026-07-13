class Solution {
    public int firstUniqChar(String s) {
        // HashMap<Character,Integer> map=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     map.put(ch,map.getOrDefault(ch,0)+1);
        // }
        // System.out.println(map);
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(map.get(ch)==1)  return i;
        // }
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
       for(int i=0;i<s.length();i++){
        if(freq[s.charAt(i)-'a']==1)    return i;
       }
       return -1;
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     int j=0;
        //     while(j<s.length()){
        //         if(ch==s.charAt(j)&&j!=i)     break;
        //         j++;
        //     }
        //     if(j==s.length()) return i;
        // }

        // return -1;
    }
}