class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // Step 1: Create a HashMap to store the frequency of each element.
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a list from the array to sort based on custom comparator.
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int num : arr) {
            resultList.add(num);
        }

        // Step 3: Sort the list based on frequency and value.
        resultList.sort((a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);

            // If frequencies are different, higher frequency comes first
            if (freqA != freqB) {
                return freqB - freqA;
            }
            // If frequencies are the same, smaller number comes first
            return a - b;
        });

        return resultList;
    }
}
