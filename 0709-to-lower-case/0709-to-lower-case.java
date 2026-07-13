class Solution {
    public String toLowerCase(String s) {
        String res="";
        for(char ch:s.toCharArray()){
            if(ch>='A'&&ch<='Z'){
                ch=(char)(ch+32);
            }
            res+=ch;
        }
        return res;
    }
}