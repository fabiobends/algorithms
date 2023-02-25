class Solution {
  int maxProfit(List<int> prices) {
    int profit = 0;
    int lastIndex = prices.length - 1;
    for (int i = 0; i < lastIndex; i++){
      int dayToSell = i + 1;
      while (dayToSell <= lastIndex && prices[i] < prices[dayToSell]){
        final int localProfit = prices[dayToSell] - prices[i];
        if (localProfit > profit){
          profit = localProfit;
        }
        dayToSell++;
      }
    }
    return profit;
  }
}