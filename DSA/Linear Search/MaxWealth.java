public class MaxWealth {
    public static void main(String[] args) {
        int accounts[][] = {
                { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        int answer = maximumWealth(accounts);
        System.out.println(answer);
    }

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // when you start a new col,take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // now we have sum of accounts of person
            // check with overall answer
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
// public class MaxWealth {
//     public static void main(String[] args) {
//         int[][] accounts = {
//                 {2, 8, 7},
//                 {7, 1, 3},
//                 {1, 9, 5}
//         };
//         int answer = maximumWealth(accounts);
//         System.out.println("The richest customer's wealth is: " + answer);
//     }

//     public static int maximumWealth(int[][] accounts) {
//         int maxWealth = 0;
//         for (int[] customerAccounts : accounts) {
//             int customerWealth = sumArray(customerAccounts);
//             maxWealth = Math.max(maxWealth, customerWealth);
//         }
//         return maxWealth;
//     }

//     private static int sumArray(int[] array) {
//         int sum = 0;
//         for (int num : array) {
//             sum += num;
//         }
//         return sum;
//     }
// }