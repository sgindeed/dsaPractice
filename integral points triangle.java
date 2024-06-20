class Solution {
    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    
    long InternalCount(long p[], long q[], long r[]) {
        // Calculate the area A of the triangle using determinant formula
        long A = Math.abs(p[0]*(q[1]-r[1]) + q[0]*(r[1]-p[1]) + r[0]*(p[1]-q[1]));
        A /= 2; // since A is an integer, divide by 2

        // Calculate the number of boundary lattice points B
        long B = gcd(Math.abs(p[0] - q[0]), Math.abs(p[1] - q[1])) +
                 gcd(Math.abs(q[0] - r[0]), Math.abs(q[1] - r[1])) +
                 gcd(Math.abs(r[0] - p[0]), Math.abs(r[1] - p[1]));

        // Calculate the number of interior lattice points using Pick's theorem
        long interiorPoints = A - B/2 + 1;

        return interiorPoints;
    }
}