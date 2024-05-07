
//2125. Number of Laser Beams in a Bank
//https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description/?envType=daily-question&envId=2024-01-03
class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0, ans = 0;

    for (String s: bank) {
      int count = 0;
      for (int i = 0; i < s.length(); i++)
        if (s.charAt(i) == '1') {
          count++;
        }

      if (count > 0) {
        ans += prev * count;
        prev = count;
      }
    }

    return ans;
    }
}
//O(M * N)
