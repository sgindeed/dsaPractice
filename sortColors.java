class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        int low = 0;
        int high = n - 1;
        int mid = 0, temp = 0;
        
        while (mid <= high) {
            switch (a[mid]) {
                
                 case 0: {
                temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
                break;
            }
                // If the element is 1
            case 1:
                mid++;
                break;
                // If the element is 2
            case 2: {
                temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
                break;
            }
                
            }
        }
    }
}
