package Day18;

public class StockProblemHomework {
    public static void main(String[] args) {
        // input : [7, 6, 4, 3, 1]
        // output : 0
        // explanation : in this case no transaction is done , i.e max profit = 0.

        int [] prices = new int[]{7, 6,4,3,1};
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int p : prices) {
            min = Math.min(min, p);
            int profit = p - min;
            maxProfit = Math.max(maxProfit, profit);
        }
        System.out.println( "max profit is:  " + maxProfit );






    }
}
