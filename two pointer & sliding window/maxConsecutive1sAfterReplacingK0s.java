import java.util.*;
    class HelloWorld {
        public static void main(String[] args) {
            Scanner se = new Scanner(System.in);
            System.out.println("ent array capacity");
            int n = se.nextInt();
            int arr[] = new int[n];
            System.out.println("ent array of 0s and 1s");
            for(int i=0; i<n; i++)
                arr[i] = se.nextInt();
            System.out.println("how many 0s can be changed to 1");
            int k = se.nextInt();
            
            int left = 0, right = 0, max = 0, zero = 0, curr = 0;
            while(right < n)
            {
                if(arr[right] == 0)
                    zero++;
                if(zero > k)
                {
                    if(arr[left] == 0)
                        zero--;
                    left++;
                }
                if(zero <= k)
                {
                    curr = right - left + 1;
                    max = Math.max(max, curr);
                }
                right++;
            }
            System.out.println("max ones after replacing k 0s = " + max);
            }
    }
