class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int len=0;
        int j=s.length()-1;
        while(j>=0){
            char c=s.charAt(j);
            if(c==' '){
                break;
            }else{
                len++;
            }
            j--;
        }
        return len;
    }
}