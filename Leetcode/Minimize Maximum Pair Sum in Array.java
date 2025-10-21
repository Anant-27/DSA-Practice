class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int start=0;
        int end=n-1;
        int currSum=0;
        int maxSum=0;
        while(start<end){
            currSum=nums[start] + nums[end];
            maxSum=Math.max(maxSum,currSum);
            start++;
            end--;
        }
        return maxSum;
    }
}
