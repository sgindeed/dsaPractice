import java.util.*;

class Solution {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        // Create a list of orders with their respective tips for A and B and their difference in tips
        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            orders.add(new Order(arr[i], brr[i]));
        }

        // Sort the orders based on the absolute difference of tips between A and B in descending order
        orders.sort((o1, o2) -> Math.abs(o2.diff) - Math.abs(o1.diff));

        long totalTips = 0;
        int countA = 0, countB = 0;

        for (Order order : orders) {
            if ((order.tipA >= order.tipB && countA < x) || countB == y) {
                totalTips += order.tipA;
                countA++;
            } else {
                totalTips += order.tipB;
                countB++;
            }
        }

        return totalTips;
    }

    static class Order {
        int tipA;
        int tipB;
        int diff;

        Order(int tipA, int tipB) {
            this.tipA = tipA;
            this.tipB = tipB;
            this.diff = tipA - tipB;
        }
    }
}
