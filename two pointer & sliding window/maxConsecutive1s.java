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
            
            int maxCount = 0;
            int currCount = 0;
            
            for(int value : arr)
            {
                if(value == 1)
                    currCount++;
                else
                    currCount = 0;
            }
            
            maxCount = Math.max(maxCount, currCount);
            System.out.println("max 1s are = " + maxCount);
        }
    }
