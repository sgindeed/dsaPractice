import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        int n = se.nextInt();
        if(n <= 2)
            System.out.println(n);
        int first = 1, second = 2, last = 0;
        for(int i=3; i<=n; i++)
        {
            last = first + second;
            first = second;
            second = last;
        }
        System.out.println("no of ways to climb stairs if user takes 1 or 2 steps to climb " + n + " stairs ; " + last);
    }
}
