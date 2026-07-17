class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0;
        int max=0;
        Arrays.sort(tokens);
        int i=0,j=tokens.length-1;
        while(i<=j){
            if(tokens[i]<=power){
                power-=tokens[i];
                score++;
                i++;
            }else if(score>0&&power<tokens[j]){
                power+=tokens[j];
                score--;
                j--;
            }else{
                break;
            }
            max=Math.max(max,score);
        }
        return max;
    }
}