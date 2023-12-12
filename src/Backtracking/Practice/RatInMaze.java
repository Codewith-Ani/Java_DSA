/**
 * WAP to find all the paths to reach from source [0,0] to destination [N - 1, N - 1]
 * 1 0 0 0
 * 1 1 0 1
 * 1 1 0 0
 * 0 1 1 1
 * [D,D,R,D,R,R],[D,R,D,D,R,R]
 */
package Backtracking.Practice;

import java.util.ArrayList;

public class RatInMaze {
    public static void main(String[] args) {
        int n = 4;
        int[][] m = new int[][]{{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        System.out.println(findPath(m,n));
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> result = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        solveMaze(result,0,0,m,n,"",visited);
        return result;
    }

    private static void solveMaze(ArrayList<String> result, int row, int col,
                                  int[][] m, int n, String path, boolean[][] visited) {

        if(row == n - 1 && col == n - 1 && m[row][col] != 0) {
            result.add(path);
            return;
        }

        if(row >= 0 && col >= 0 && row < n && col < n) {
            if(visited[row][col] || m[row][col] == 0) {
                return;
            }
            visited[row][col] = true;
            solveMaze(result, row + 1, col, m, n, path + 'D', visited); // DOWN
            solveMaze(result, row, col - 1, m, n, path + 'L', visited); // LEFT
            solveMaze(result, row, col + 1, m, n, path + 'R', visited); // RIGHT
            solveMaze(result, row - 1, col, m, n, path + 'U', visited); // UP
            visited[row][col] = false;
        }
    }
}