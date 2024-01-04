class Solution {
  public int countSubarraysWithSumK(int[] arr, int k) {
    int count = 0;
    int runningSum = 0;

    Map<Integer, Integer> negatingSumsToCount = new HashMap<>();
    negatingSumsToCount.put(0, 1);

    for (int i = 0; i < arr.length; i++) {
      runningSum += arr[i];

      int negatingSumKey = runningSum - k;
      if (negatingSumsToCount.containsKey(negatingSumKey)) {
        count += negatingSumsToCount.get(negatingSumKey);
      }

      negatingSumsToCount.put(
        runningSum,
        negatingSumsToCount.getOrDefault(runningSum, 0) + 1
      );
    }

    return count;
  }
}
//TC O(N)
//SC O(N)
