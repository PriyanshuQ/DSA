class Solution {
    Integer rowDir = 0, colDir = 1;
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int row=0, col=0;

        while(num<=n*n){
            matrix[row][col] = num;
            
            int tempRow = row+rowDir;
            int tempCol = col+colDir;

            if(tempRow<0 || tempCol<0 || tempRow==n || tempCol==n || matrix[tempRow][tempCol]!=0){
                changeDirection();
            }

            row += rowDir;
            col += colDir;

            num++;
        }
        return matrix;
    }

    public void changeDirection(){
        if(rowDir == 0 && colDir == 1){
            colDir = 0;
            rowDir = 1;
        }
        else if(rowDir == 1 && colDir == 0){
            colDir = -1;
            rowDir = 0;
        }
        else if(rowDir == 0 && colDir == -1){
            colDir = 0; 
            rowDir = -1;
        }
        else if(rowDir == -1 && colDir == 0){
            colDir = 1;
            rowDir = 0;
        }
    }
}