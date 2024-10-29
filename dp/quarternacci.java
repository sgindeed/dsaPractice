import java.util.*;
class HelloWorld {
    static int dp[];
    public static int fib(int a){
        if(a <= 4)
            return a;
        if(dp[a] != -1)
            return dp[a];
        return fib(a-1) + fib(a-2) + fib(a-3) + fib(a-4);
    }
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        int n = se.nextInt();
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fib(n));
    }
}
