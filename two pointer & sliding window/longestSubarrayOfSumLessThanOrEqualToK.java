import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    Scanner se = new Scanner(System.in);
    System.out.println("no of elements");
    int n = se.nextInt();
    int arr[] = new int[n];
    System.out.println("add array elements");
    for(int i=0; i<n; i++)
    {
        System.out.println("add element no." + (i+1));
        arr[i] = se.nextInt();
    }
    System.out.println("ent required subarray sum");
    int k = se.nextInt();
    int left = 0, right = 0, sum = 0, maxLen = 0;
    while(right < n)
    {
        sum = sum + arr[right];
        while(sum > k)
        {
            sum = sum - arr[left];
            left++;
        }
        right++;
    }
    if(sum <= k)
            System.out.println("maxLen = " + Math.max(maxLen, right- left + 1));
    }
}
