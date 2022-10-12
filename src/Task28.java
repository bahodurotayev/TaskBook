public class Task28 {
    static int bestTimeToBuyAndSellStock(int[] prices){
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }else {
                max = Math.max(max, prices[i] - min);
            }
        }
        return max;
    }
    static int bestTimeToBuyAndSellStock2(int[] prices){
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }else if(prices[i] - min > max){
                max = prices[i] - min;
            }
        }
        return max;
    }
    public static void main(String[] args) {

       int[] prices = {7,1,5,3,6,4};
        int i = bestTimeToBuyAndSellStock(prices);
        System.out.println(i);
    }

}
