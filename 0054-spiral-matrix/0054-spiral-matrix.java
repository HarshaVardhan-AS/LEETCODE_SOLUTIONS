class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int i,j;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;
        while(top<= bottom && left<=right){
            for(i = left; i<=right; i++){
                res.add(matrix[top][i]);
            }
            top++;
            
            for(j =top; j<=bottom; j++ ){
                res.add(matrix[j][right]);
            }
            right--;
            
            if(top<=bottom){
            for(i = right; i>=left; i--){
               res.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(right>=left){
                for(i = bottom; i>= top; i--)
                res.add(matrix[i][left]);
                left++;
            }
        }
        return res;
        
    }
}