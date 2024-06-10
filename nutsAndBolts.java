import java.util.HashMap;

class Solution {
    void matchPairs(int n, char nuts[], char bolts[]) {
        // Define the order of the elements
        HashMap<Character, Integer> order = new HashMap<>();
        order.put('!', 1);
        order.put('#', 2);
        order.put('$', 3);
        order.put('%', 4);
        order.put('&', 5);
        order.put('*', 6);
        order.put('?', 7);
        order.put('@', 8);
        order.put('^', 9);

        // Sort both arrays based on the order
        sortArray(nuts, order);
        sortArray(bolts, order);
    }

    void sortArray(char[] arr, HashMap<Character, Integer> order) {
        quickSort(arr, 0, arr.length - 1, order);
    }

    void quickSort(char[] arr, int low, int high, HashMap<Character, Integer> order) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high, order);
            quickSort(arr, low, pivotIndex - 1, order);
            quickSort(arr, pivotIndex + 1, high, order);
        }
    }

    int partition(char[] arr, int low, int high, HashMap<Character, Integer> order) {
        char pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (order.get(arr[j]) < order.get(pivot)) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
