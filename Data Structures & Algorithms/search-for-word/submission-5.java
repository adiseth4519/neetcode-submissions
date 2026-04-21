class Solution {
    public boolean search(int i, int j, char[][] board, String word, int b){
        if(b==word.length()) return true;
        if(i<0 || i>=board.length || j<0 || j>=board[0].length) return false;
        if(board[i][j]!=word.charAt(b)) return false;
        if(board[i][j]=='#') return false;
        char temp= board[i][j];
        board[i][j]='#';
        boolean f= search(i+1, j, board, word, b+1) || search(i, j+1, board, word, b+1) || search(i-1, j, board, word, b+1) || search(i, j-1, board, word, b+1);
        board[i][j]= temp;
        return f; 
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]==word.charAt(0)){
                    if(search(i, j, board, word, 0)) return true;
                }
            }
        }
        return false;
    }
}
