class Solution {
    public void rotate(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i=0;i<row;i++)
        {
            for(int j=i+1;j<col;j++)
            {
                // System.out.print(matrix[i][j] + " : "+ matrix[j][i]);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //int i=0, j=col-1;
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col/2;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][col-j-1];
                matrix[i][col-j-1] = temp;
            }
        }
        
        /*
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }
        */
    }
}