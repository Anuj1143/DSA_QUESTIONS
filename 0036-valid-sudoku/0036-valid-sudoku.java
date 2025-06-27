class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String>ch=new HashSet<>();
        for(int i=0; i<9; i++){
            for(int j=0;  j<9; j++){
                char number=board[i][j];
                if(number!='.'){
                    if(!ch.add(number+"in row"+i)||!ch.add(number+"in col"+j)|| !ch.add(number+"in box"+i/3+"-"+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}