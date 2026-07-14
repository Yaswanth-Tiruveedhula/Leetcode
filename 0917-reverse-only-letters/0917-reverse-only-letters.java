class Solution {
    public String reverseOnlyLetters(String s) {
        // int i=s.length()-1;
        char[] ch=s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            if((ch[i]>='a'&& ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')){
                if((ch[j]>='a'&&ch[j]<='z') || (ch[j]>='A'&&ch[j]<='Z')){
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                    i++;
                    j--;
                }
                else    j--;
            }
            else   i++;
        }
        return new String(ch);
    }
}