package Backtracking.Practice;

public class MaximumGold {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{0,6,0},{5,8,7},{0,9,0}};
        System.out.println(getMaximumGold(grid));
    }

    private static int getMaximumGold(int[][] grid) {
        // 1. Base condition
        if(grid == null || grid.length == 0)
            return 0;

        int max = 0;
        int m = grid.length;
        int n = grid[0].length;

        // 2. Explore Nodes which are not zero

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] > 0) {
                    int gold = findMaxGold(grid, i, j, m, n,new boolean[m][n]);
                    max = Math.max(max, gold);
                }
            }
        }
        return max;
    }

    private static int findMaxGold(int[][] grid, int i, int j, int m, int n, boolean[][] visited) {
        //1. Do not go out of bound
        //2. Do not explore already visited cells
        //3. Do not explore 0
        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }
        // Explore the cell that is not in above condition

        // mark it visited
        visited[i][j] = true;

        int left= findMaxGold(grid, i, j - 1, m, n, visited);
        int right = findMaxGold(grid, i, j + 1, m, n, visited);
        int top = findMaxGold(grid, i - 1, j, m, n, visited);
        int bottom = findMaxGold(grid, i + 1, j, m, n, visited);

        visited[i][j] = false;
        return Math.max(left,Math.max(right,Math.max(top,bottom))) + grid[i][j];
    }
}