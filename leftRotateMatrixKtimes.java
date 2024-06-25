class Solution {
  public int[][] rotateMatrix(int k, int[][] mat) {
    int m = mat.length; // number of rows in the matrix
    int n = mat[0].length; // number of columns in the matrix

    // Handle the case where k is greater than the number of elements in a row
    k = k % n; 

    // Create a new matrix to store the rotated elements
    int[][] newMat = new int[m][n];

    // Perform the rotation
    for (int i = 0; i < m; i++) {
      int temp[] = new int[n]; // Temporary array to store row elements
      System.arraycopy(mat[i], 0, temp, 0, n); // Copy row to temporary array

      // Perform k left rotations on the row elements
      for (int j = 0; j < k; j++) {
        int first = temp[0];
        for (int l = 0; l < n - 1; l++) {
          temp[l] = temp[l + 1];
        }
        temp[n - 1] = first;
      }

      // Copy the rotated row to the new matrix
      System.arraycopy(temp, 0, newMat[i], 0, n);
    }

    return newMat;
  }
}
