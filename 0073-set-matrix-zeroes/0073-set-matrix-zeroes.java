class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstrow = false;
        boolean firstcolumn = false;
        int i, j;
        for(i = 0; i<cols; i++){
            if(matrix[0][i] == 0)
            firstrow = true;
        }
        for(i = 0; i<rows; i++){
            if(matrix[i][0] == 0)
            firstcolumn = true;
        }
        for(i = 1; i<rows; i++){
            for(j = 1; j<cols; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0]= 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(i = 1; i<rows; i++){
            for(j = 1; j<cols; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                matrix[i][j] =0;
            }
        }
        if(firstrow){
            for(i = 0; i<cols; i++)
            matrix[0][i] = 0;
        }
        if(firstcolumn){
            for(i = 0; i<rows; i++){
                matrix[i][0] = 0;
            }
        }
        
    }
}