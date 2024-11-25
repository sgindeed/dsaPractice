import java.util.*;
class Main{
    public static int factorial (int num){
        int pro =1;
        for(int i=1; i<=num; i++)
            pro *= i;
        return pro;
    }
    public static boolean krishna(int n){
        int temp = n;
        int d = 0;
        int krish = 0;
        while(temp > 0){
            d = temp % 10;
            krish += factorial(d);
            temp /= 10;
        }
        if(krish == n)
            return true;
        return false;
    }
    public static void main(String[] args){
        Scanner se = new Scanner(System.in);
        int a = se.nextInt();
        boolean res = krishna(a);
        System.out.println(res);
    }
}
