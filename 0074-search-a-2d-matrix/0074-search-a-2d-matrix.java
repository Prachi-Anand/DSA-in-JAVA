class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0;
        int high=m*n-1;
        while(l<=high){
            int mid=l+(high-l)/2;
            int row = mid/n;
            int columns = mid%n;

            if(matrix[row][columns]<target)
            {
                l=mid+1;
            }
            else if(matrix[row][columns]>target)
            { 
                high = mid-1;
                
            }
            else{
                return true;
            }
        
        }
        return false;
        
    }
}