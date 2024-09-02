class Solution
{
    static class Cell {
        int x, y, cost;
        Cell(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }
    //Function to return the minimum cost to react at bottom
	//right cell from top left cell.
    public int minimumCostPath(int[][] grid)
    {
        int n = grid.length;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // right, down, left, up
        boolean[][] visited = new boolean[n][n];
        PriorityQueue<Cell> pq = new PriorityQueue<>(Comparator.comparingInt(c -> c.cost));
        
        // Start BFS from the top-left corner
        pq.offer(new Cell(0, 0, grid[0][0]));
        visited[0][0] = true;

        while (!pq.isEmpty()) {
            Cell current = pq.poll();
            int x = current.x, y = current.y, cost = current.cost;

            // If we reach the bottom-right corner, return the cost
            if (x == n - 1 && y == n - 1) {
                return cost;
            }

            // Explore neighbors
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                if (newX >= 0 && newX < n && newY >= 0 && newY < n && !visited[newX][newY]) {
                    visited[newX][newY] = true;
                    pq.offer(new Cell(newX, newY, cost + grid[newX][newY]));
                }
            }
        }

        // If we can't reach the bottom-right corner, return -1
        return -1;
    }
}
