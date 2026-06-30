class Solution {
    public int strStr(String haystack, String needle) {
        int d=needle.length();
        for(int i=0;i<=haystack.length()-d;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                String next=haystack.substring(i,i+d);
                if(next.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}