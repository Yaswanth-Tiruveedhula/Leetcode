class Solution {
    public String countAndSay(int n) {
        if(n==1)    return "1";
        else return conca(countAndSay(n-1));
    }
    public String conca(String s){
        // System.out.println(s);
        String res="";
        int c=1;
        int i=0;
        // char ch=s.charAt(i++);
        while(i<s.length()-1){
            if(s.charAt(i)==s.charAt(i+1)){
                c++;
            }
            else{
                res=res.concat(String.valueOf(c));
                res+=s.charAt(i);
                c=1;
                // ch=s.charAt(i);
            }
            i++;
        }
        res+=c;
        res+=s.charAt(i);
        return res;
    }
}