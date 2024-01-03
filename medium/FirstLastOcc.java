//34. Find First and Last Position of Element in Sorted Array
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
class Solution {
    public int findFirstOcc(int[] nums,int size,int target){
        int hi=size;
        int lo=0;
        int res=-1;
        while (hi>=lo){
            int mid = lo + (hi -lo)/2;

            if (nums[mid] == target){
                res  = mid;
                hi = mid - 1;
            }
            else if(nums[mid]> target){
                hi = mid -1;
            }else{
                lo = mid+1;
            }
 
        }
        return res;
    }
        public int findLastOcc(int[] nums,int size,int target){
        int hi=size;
        int lo=0;
        int res=-1;
        while (hi>=lo){
            int mid = lo + (hi -lo)/2;

            if (nums[mid] == target){
                res  = mid;
                lo = mid + 1;
            }
            else if(nums[mid]> target){
                hi = mid -1;
            }else{
                lo = mid+1;
            }
 
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {

        int ans[]={-1,-1};
        int size = nums.length - 1;
        ans[0]=findFirstOcc(nums,size,target);
        ans[1]=findLastOcc(nums,size,target);
        return ans;
        
    }
}
