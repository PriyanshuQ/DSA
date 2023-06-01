class Solution {
    public void rotate(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0;i<rows;i++){
            for(int j=i;j<cols-i-1;j++){
                rotate(i, j, matrix[i][j], matrix, 0);
            }
        }
    }


    public void rotate(int row, int col, int cellValue, int[][] matrix, int rotation){
        if(rotation == 4) return;
        
        int newRow = col;
        int newCol = matrix.length-row-1;

        int newCellValue = matrix[newRow][newCol];
        matrix[newRow][newCol] = cellValue;

        rotate(newRow, newCol, newCellValue, matrix, rotation+1);
        
    }
}