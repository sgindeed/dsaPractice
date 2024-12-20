import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return result;
        }
        
        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;
        
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(mat[top][i]);
            }
            top++;
            
            for (int i = top; i <= bottom; i++) {
                result.add(mat[i][right]);
            }
            right--;
            
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(mat[bottom][i]);
                }
                bottom--;
            }
            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(mat[i][left]);
                }
                left++;
            }
        }
        
        return result;
    }
}
