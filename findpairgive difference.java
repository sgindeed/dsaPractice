class Solution {
public int findPair(int n, int x, int[] arr) {
  // Use a hash set to store seen elements efficiently
  Set<Integer> seen = new HashSet<>();
  
  for (int num : arr) {
    // Check if the complement (number needed for the pair) exists
    int complement = num + x;
    int otherHalf = num - x;
    
    // If either the complement or other half is already seen, a pair exists
    if (seen.contains(complement) || seen.contains(otherHalf)) {
      return 1;
    }
    
    // Add current element to the set for future checks
    seen.add(num);
  }
  
  // If no pair is found, return -1
  return -1;
}
}
