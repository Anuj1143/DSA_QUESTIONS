class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][]board){
        for(int i=0;i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]=='.'){
                    for(char num='1'; num<='9'; num++){
                        if(isValid(board, i, j, num)){
                            board[i][j]=num;
                            if(solve(board)){
                                return true;
                            }
                            board[i][j]='.';
                        }

                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] digit, int row, int col,char num){
        for(int i=0; i<9; i++){
            if(digit[row][i]==num) return false;
        }
        for(int j=0; j<9; j++){
            if(digit[j][col]==num) return false;
        }
        int boxStart=row-row%3;
        int boxCol=col-col%3;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(digit[boxStart+i][boxCol+j]==num) return false;
            }
        }
        return true;
    }
}