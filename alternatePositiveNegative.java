import java.util.ArrayList;

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // Step 1: Separate positive and negative elements
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        // Step 2: Merge positive and negative arrays alternately
        int posIndex = 0, negIndex = 0, i = 0;
        
        // While there are both positive and negative elements
        while (posIndex < positive.size() && negIndex < negative.size()) {
            if (i % 2 == 0) {
                arr.set(i, positive.get(posIndex++));
            } else {
                arr.set(i, negative.get(negIndex++));
            }
            i++;
        }

        // If there are remaining positive elements
        while (posIndex < positive.size()) {
            arr.set(i++, positive.get(posIndex++));
        }

        // If there are remaining negative elements
        while (negIndex < negative.size()) {
            arr.set(i++, negative.get(negIndex++));
        }
    }
}
