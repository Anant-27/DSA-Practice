class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0;
        double ans=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        ans=sum;
        for(int i=k;i<n;i++){
           sum+=nums[i];
           sum-=nums[i-k];
           ans=Math.max(ans,sum) ;
        }
        return ans/k;
    }
}
