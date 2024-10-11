public List<Integer> rearrange(List<Integer> arr) {
        int n = arr.size();
        // Create a new list initialized to -1
        List<Integer> result = new ArrayList<>();
        
        // Initialize the list with -1
        for (int i = 0; i < n; i++) {
            result.add(-1);
        }
        
        // Place the elements at their correct positions if they are within range
        for (int i = 0; i < n; i++) {
            int value = arr.get(i);
            if (value >= 0 && value < n) {
                result.set(value, value);
            }
        }
        
        // Return the rearranged list
        return result;
    }
}
