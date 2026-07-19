class Solution {
    public String rearrangeString(String s, char x, char y) {
        if(!s.contains(x+"")||!s.contains(y+""))   return s;
        StringBuilder sb=new StringBuilder();
        int count=0,ycount=0;
        for(char ch:s.toCharArray()){
            if(ch==y){
                ycount++;
            }
        }
        for(int i=0;i<ycount;i++){
            sb.append(y);
        }

        for(char ch:s.toCharArray()){
            if(ch!=y){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}