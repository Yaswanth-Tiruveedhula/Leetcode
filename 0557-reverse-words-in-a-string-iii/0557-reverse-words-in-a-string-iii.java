class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        String res="";
        for(String let:str){
            int i=let.length()-1;
            while(i>=0){
                res+=(let.charAt(i)+"");
                i--;
            }
            res+=" ";
        }
        return res.trim();
    }
}