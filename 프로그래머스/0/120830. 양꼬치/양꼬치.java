class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int serviceDrinks = n/10;
        int payableDrinks = k - serviceDrinks;
        return (n*12000 + payableDrinks*2000);
    }
}