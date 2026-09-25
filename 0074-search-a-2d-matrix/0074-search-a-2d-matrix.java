class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i=0;
        int j=m*n-1;
        while(i<=j)
        {
            int mid = i+(j-i)/2;
            int rows = mid/n;
            int cols = mid%n;
            if(matrix[rows][cols]>target)
            {
                j=mid-1;
            }
            else if(target>matrix[rows][cols]){
                i=mid+1;
            }
            else{
                return true;
            }
        }
        return false;
        
    }
}