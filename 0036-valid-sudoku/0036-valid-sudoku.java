class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String>set=new HashSet<>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char number=board[i][j];
                if(number!='.'){
                    String rowKey=number+"is row"+i;
                    String colKey= number+"is Col"+j;
                    String box=number+"is box"+i/3+"-"+j/3;
                    if(!set.add(rowKey)|| !set.add(colKey)|| !set.add(box)){
                        return false;
                    }
                }
            }
        }
        return true;
        
    }
}