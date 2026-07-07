class Solution {
    public boolean search2DMatrix(int[][] matrix, int target) {
        int m = matrix.lenght;
        int n = matrix[0].length;
        int row = 0;
        int col = n-1;
        while( row<m && col>=0){
            if (matrix[row][col] == target){
                return true;
            }
            if (matrix [row][col]>target){
                col--;
            }
            else{
                row ++;
            }}
            return false;
            }
  
        
    }
}
