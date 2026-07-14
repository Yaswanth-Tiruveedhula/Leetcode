class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String[] str=s.split(" ");
        char[] ch=pattern.toCharArray();
        if(ch.length!=str.length)   return false;
        int i=0;
        for(char now:ch){
            if(map.containsKey(now)){
                if(!map.get(now).equals(str[i])){
                    return false;
                }
            }else if(map.containsValue(str[i])){
                return false;
            }else{
                map.put(now,str[i]);
            }
            i++;
        }
        return true;
    }
}