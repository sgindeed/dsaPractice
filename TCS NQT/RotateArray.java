class Solution{
  static void reverse(int arr[], int start, int end){
    while(start < end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
  
  static void rotateArray(int arr[], int d, int n){
    if(d == 0)
        return;
    d = d % n;

    reverse(arr, 0, d-1);
    reverse(arr, d, n-1);
    reverse(arr, 0, n-1);
  }
}
