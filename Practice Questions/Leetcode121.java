class Leetcode121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = prices[0]; // Variable to store the minimum price so far
        for (int i = 0; i < prices.length; i++) {
            // Update the minimum price encountered so far
            minSoFar = Math.min(minSoFar, prices[i]);

            // Calculate the current profit by subtracting the minimum price so far from the current price
            int profit = prices[i] - minSoFar;

            // Update the maximum profit if the current profit is greater than the previous maximum
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 5, 2, 6, 1, 4 };
        Leetcode121 solution = new Leetcode121();

        int result = solution.maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}