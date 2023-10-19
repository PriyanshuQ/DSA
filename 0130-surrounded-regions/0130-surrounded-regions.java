class Solution {
    public void solve(char[][] board) {
    if (board == null || board.length == 0) {
        return;
    }
    int m = board.length;
    int n = board[0].length;

    
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if ((i == 0 || i == m - 1 || j == 0 || j == n - 1) && board[i][j] == 'O') {
                markSafe(board, i, j);
            }
        }
    }

    
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (board[i][j] == 'O') {
                board[i][j] = 'X';
            } else if (board[i][j] == '*') {
                board[i][j] = 'O';
            }
        }
    }
}

private void markSafe(char[][] board, int i, int j) {
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {
        return;
    }
    board[i][j] = '*'; 
    markSafe(board, i - 1, j); 
    markSafe(board, i + 1, j);
    markSafe(board, i, j - 1);
    markSafe(board, i, j + 1);
   }


}