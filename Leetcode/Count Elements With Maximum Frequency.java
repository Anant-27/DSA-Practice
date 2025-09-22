class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();

        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        int maxF=0;
        for(int val:freq.values()){
            maxF=Math.max(maxF,val);
        }

        int ans=0;
        for(int val:freq.values()){
            if(val==maxF){
                ans+=val;
            }
        }
        return ans;
    }
}
