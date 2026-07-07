class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int k=numBottles;
        while(numBottles>=numExchange){
            // k+=numBottles;
            int rem=numBottles%numExchange;
            numBottles/=numExchange;
            k+=numBottles;
            numBottles+=rem;
        }
        return k;
    }
}