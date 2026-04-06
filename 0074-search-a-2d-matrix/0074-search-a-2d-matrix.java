class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = n-1;
        int ub = 0;
        while(low<= high){
            int mid = low + (high-low)/2;
            if(matrix[mid][m-1]<= target){
                if(matrix[mid][m-1] == target)
                return true;
                else
                low = mid+1;
            }
            else
            {
               ub = mid;
               high = mid-1;
            }
        }
        low = 0;
        high = m-1;
        while(low<= high){
            int mid = low + (high-low)/2;
            if(matrix[ub][mid] == target)
            return true;
            else if(matrix[ub][mid] < target)
            low = mid+1;
            else
            high = mid-1;
        }
        return false;
        
    }
}