class Solution {
    char[][] board;
    List<List<String>> res;
    boolean[] posdiag;
    boolean[] negdiag;
    boolean[] cols;
    
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        posdiag = new boolean[2*n];
        negdiag = new boolean[2*n];
        cols = new boolean[n];
        board = new char[n][n];
        for(int i = 0; i<n; i++){
            Arrays.fill(board[i], '.');
        }
        solve(0);
        return res;
    
    }
    public void solve(int row){
        if(row == board.length){
        List<String> temp = new ArrayList<>();
        for(int i = 0; i<board.length; i++){
           String s1 = new String(board[i]);
           temp.add(s1);
        }
        res.add(temp);
        return;
        }
        for(int col = 0; col<board.length; col++){
            if(cols[col] || posdiag[row + col] || negdiag[row - col + (board.length -1)])
            continue;

            cols[col] = true;
            posdiag[row+col] = true;
            negdiag[row - col + (board.length -1)] = true;
            board[row][col] = 'Q';
            solve(row +1);
            cols[col] = false;
            posdiag[row+col] = false;
            negdiag[row - col + (board.length -1)] = false;
            board[row][col] = '.';
        }
    }
}