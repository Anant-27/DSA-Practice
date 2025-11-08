class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        int diff=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==max){
                continue;
            }
            else{
                diff=Math.abs(max-nums[i]);
                count=count+diff;
            }
        }
        return count;
    }
}
