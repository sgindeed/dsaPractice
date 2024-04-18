class Solution
{
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = matrix[n - i - 1][n - j - 1];
                
                matrix[n - i - 1][n - j - 1] = matrix[n - j - 1][i];
                
                matrix[n - j - 1][i] = temp;
            }
        }
    }
}
