package Backtracking.Practice;

import java.util.ArrayList;
import java.util.List;

public class N_QUEENS {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solveNQueen(n));
    }
    public static List<List<String>> solveNQueen(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> result = new ArrayList<>();
        queenSolver(board, 0, result);
        return result;
    }

    private static void queenSolver(char[][] board, int row, List<List<String>> result) {
        if(row == board.length) {
            result.add(makeString(board));
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row, col)) {
                board[row][col] = 'Q';
                queenSolver(board, row + 1, result);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        // VERTICAL
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q')
                return false;

        // LEFT DIAGONAL
        int maxLeft = Math.min(row,col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row - i][col - i] == 'Q')
                return false;
        }

        // RIGHT DIAGONAL
        int maxRight = Math.min(row, board.length - 1 - col);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row - i][col + i] == 'Q')
                return false;
        }
        return true;
    }

    private static List<String> makeString(char[][] board) {
        List<String> vList = new ArrayList<>();
        for (char[] chars : board) {
            String row = new String(chars);
            vList.add(row);
        }
        return vList;
    }
}
