class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        boolean[] row = new boolean[rows];
        boolean[] col = new boolean[columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]= true;
                    col[j] = true;
                }
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(row[i]||col[j])
                {
                    matrix[i][j]=0;
                }
            }
        }

        
    }
}