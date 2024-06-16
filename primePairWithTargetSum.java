

class Solution {

    public static boolean isPrime(int a){
        if (a <= 1) return false;
        if (a <= 3) return true;
        if (a % 2 == 0 || a % 3 == 0) return false;

        int limit = (int) Math.sqrt(a);
        for (int i = 5; i * i <= a; i += 6) {
            if (a % i == 0 || a % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static ArrayList<Integer> getPrimes(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 2; i <= n/2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                arr.add(i);
                arr.add(n - i);
                break;  
            }
            
            
        }
        if(arr.size()==0){
                arr.add(-1);
                arr.add(-1);
            }
        
        return arr;
    }
}