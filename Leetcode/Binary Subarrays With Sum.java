class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
     return helper(nums,k)-helper(nums,k-1);
    }
    public static int helper(int[] nums,int k){
        int n=nums.length;
        int count=0;
        int sum=0;
        int low=0;;
        for(int high=0;high<n;high++){
            sum+=nums[high];

            while(sum>k && low<=high){
                sum-=nums[low];
                low++;
            }
            count+=(high-low+1);
        }
        return count;
    }
}
