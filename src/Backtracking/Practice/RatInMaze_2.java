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

public class RatInMaze_2 {
    public static void main(String[] args) {
        int n = 4;
        int[][] m = new int[][]{{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        System.out.println(findPath(m,n));
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> result = new ArrayList<>();
        solveMaze(result,0,0,m,n,"");
        return result;
    }

    private static void solveMaze(ArrayList<String> result, int row, int col,
                                  int[][] m, int n, String path) {

        if(row == n - 1 && col == n - 1 && m[row][col] != 0) {
            result.add(path);
            return;
        }

        if(row >= 0 && col >= 0 && row < n && col < n && m[row][col] != 0) {
            int temp = m[row][col];
            m[row][col] = 0;
            solveMaze(result, row + 1, col, m, n, path + 'D'); // DOWN
            solveMaze(result, row, col - 1, m, n, path + 'L'); // LEFT
            solveMaze(result, row, col + 1, m, n, path + 'R'); // RIGHT
            solveMaze(result, row - 1, col, m, n, path + 'U'); // UP
            m[row][col] = temp;
        }
    }
}