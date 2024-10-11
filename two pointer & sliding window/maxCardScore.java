class Solution {
    public int maxScore(int[] cards, int k) {
      int leftSum = 0, rightSum = 0, maxSum = 0, rightIndex = cards.length-1;
      
      for(int i=0; i<k; i++)
        leftSum += cards[i];
      maxSum = leftSum;

      for(int i=k-1; i>=0; i--)
        {
          leftSum = leftSum - cards[i];
          rightSum = rightSum + cards[rightIndex];
          maxSum = Math.max(maxSum, leftSum + rightSum);
          rightIndex--;
        }
      return maxSum;
    }
}
