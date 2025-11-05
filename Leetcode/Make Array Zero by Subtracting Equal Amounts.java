class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        while(!allZeroes(nums)){
            cnt += 1;
            int min = getMin(nums);
            for(int i=0;i<n;i++){
                if(nums[i] == 0) continue;
                nums[i] -= min;
            }
        }
        return cnt;
    }
    private int getMin(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            if(num == 0) continue;
            min = Math.min(num, min);
        }
        return min;
    }
    private boolean allZeroes(int[] nums){
        for(int num : nums){
            if(num != 0) return false;
        }
        return true;
    }
}
