class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m =  matrix.length;
        int n =  matrix[0].length;
        int row = 0;
        int columns = n-1;
        while(row<m &&columns>=0 )
        {
            int mid =  matrix[row][columns];
            if(mid == target)
            {
                return true;
            }
            else if(target<mid)
            {
                columns --;
            }
            else{
                row++;;
            }
        }
        return false;        
    }
}