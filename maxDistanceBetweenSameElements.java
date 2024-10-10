 HashMap<Integer, Integer> map = new HashMap<>();
        int maxDist = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                // Store the first occurrence index of each element
                map.put(arr[i], i);
            } else {
                // Calculate the distance between the current and first occurrence
                int dist = i - map.get(arr[i]);
                maxDist = Math.max(maxDist, dist);
            }
        }

        return maxDist;
