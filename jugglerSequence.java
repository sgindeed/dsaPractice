class Solution {
    static List<Integer> jugglerSequence(int n) {
        // code here
        List<Integer> sequence = new ArrayList<>();
        sequence.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n = (int) Math.floor(Math.sqrt(n));
            } else {
                n = (int) Math.floor(Math.sqrt(n) * Math.sqrt(n) * Math.sqrt(n));
            }
            sequence.add(n);
        }

        return sequence;
    }
}