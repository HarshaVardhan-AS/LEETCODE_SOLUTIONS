class Solution {
    public boolean exist(char[][] board, String word) {
        boolean res = false;
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                res = solve(i, j, board, word, 0);
                if(res)
                return res;

            }
        }
        return res;
        
    }
    public boolean solve(int r, int c, char[][] board, String word, int idx){
        boolean result;
        if(idx == word.length())
        return true;
        if(r>= board.length || r<0 || c>= board[0].length || c<0)
        return false;
        if(board[r][c]!= word.charAt(idx))
        return false;
        if(board[r][c] == '*')
        return false;

        
            char temp = board[r][c];
            board[r][c] = '*';
        result = solve(r+1, c, board, word, idx+1) || solve(r-1,c, board, word, idx+1) || solve(r, c+1, board, word, idx+1) || solve(r, c-1, board, word, idx+1);
        board[r][c] = temp;
        
        return result;
    }
}