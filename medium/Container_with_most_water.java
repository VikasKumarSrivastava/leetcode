//https://leetcode.com/problems/container-with-most-water/
class Solution {
    public int maxArea(int[] height) {
        int res =0;
        int l,r,area;
        l= 0;
        r =height.length -1;
        while (l<r){
            area = (r-l) * Math.min(height[l],height[r]);
            res = Math.max(area,res);
            if(height[l]<height[r]){
                l+=1;
            }else{
                r-=1;
            }
        }
        return res;
    }
}
