class Solution {

    String compareFrac(String str) {
        // Split the input string to get the two fractions
        String[] fractions = str.split(", ");
        
        // Further split each fraction to get the numerators and denominators
        String[] frac1 = fractions[0].split("/");
        String[] frac2 = fractions[1].split("/");
        
        // Parse the numerators and denominators as integers
        int a = Integer.parseInt(frac1[0]);
        int b = Integer.parseInt(frac1[1]);
        int c = Integer.parseInt(frac2[0]);
        int d = Integer.parseInt(frac2[1]);
        
        // Cross-multiply to compare the fractions
        // a/b > c/d  is equivalent to a * d > c * b
        int leftSide = a * d;
        int rightSide = c * b;
        
        if (leftSide > rightSide) {
            return fractions[0]; // a/b is greater
        } else if (leftSide < rightSide) {
            return fractions[1]; // c/d is greater
        } else {
            return "equal"; // both fractions are equal
        }
    }
}
