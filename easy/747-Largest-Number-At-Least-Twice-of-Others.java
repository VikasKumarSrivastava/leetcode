//https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/
class Solution {
    public int dominantIndex(int[] nums) {
        int max1 = 0;
        int max2= 0;
        int maxIndex =0;
        for(int i =0;i<nums.length;i++){
            if(max1 < nums[i]){
                max2 = max1;
                max1 =nums[i];
                maxIndex  = i;
            }else if(max2<nums[i]){
                max2=nums[i];
            }
        }
        return max1 >= max2 * 2 ? maxIndex : -1;
    }
}
