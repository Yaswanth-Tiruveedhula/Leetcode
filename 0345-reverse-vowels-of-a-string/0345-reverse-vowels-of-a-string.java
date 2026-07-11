class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int left=0,right=ch.length-1;
        String now="aeiouAEIOU";
        while(left<right){
            while(left<right&& !(now.contains(ch[left]+""))){
                left++;
            }
            while(right>left&&!(now.contains(ch[right]+""))){
                right--;
            }
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        return new String(ch);
    }
}