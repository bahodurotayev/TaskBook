public class Task28 {
    static int bestTimeToBuyAndSellStock(int[] prices){
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < min){
                min = prices[i];
               // profit = 0;
            } else if(prices[i] - min > profit) {
                profit = prices[i] - min;
            }
        }
      return profit;
    }
    static int bestTimeToBuyAndSellStock2(int[] prices){
      int min = Integer.MAX_VALUE;
      int profit = 0;
      int index = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < min){
                min = prices[i];
                index = i;
            }
        }
        for (int i = index; i < prices.length; i++) {
            if(prices[i] - min > profit){
                profit = prices[i] - min;
            }
        }
        return profit;
    }
    public static void main(String[] args) {

       int[] prices = {7,4,5,3,6,1}; // 7,4,5,3,6,1    7,1,5,3,6,4  7,6,4,3,1  1,7,4,3,1
        int i = bestTimeToBuyAndSellStock(prices);
        System.out.println(i);
    }

}
