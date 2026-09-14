class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] row = new Set[9];
        Set<Character>[] col = new Set[9];
        Set<Character>[] box = new Set[9];
        int boxNo;

        for (int i = 0; i < 9; i++) {
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(!row[i].add(board[i][j])){
                    return false;
                }
                if(!col[j].add(board[i][j])){
                    return false;
                }
                boxNo=(i/3)*3+(j/3);
                if(!box[boxNo].add(board[i][j])){
                    return false;
                }
            }
        }
        return true;
    }
}
